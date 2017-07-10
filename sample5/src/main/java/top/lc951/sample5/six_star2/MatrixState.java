package top.lc951.sample5.six_star2;

import android.opengl.Matrix;

import java.nio.ByteBuffer;

/**
 * @author lichong_951@163.com
 * @version V1.0
 * @Description: TODO
 * @date 2017/7/8  15:52
 * @powered by lichong
 */

public class MatrixState {
    private static float[] mProjMatrix = new float[16];// 4x4矩阵 投影用
    private static float[] mVMatrix = new float[16];// 摄像机位置朝向9参数矩阵
    private static float[] mMVPMatrix;// 最后起作用的总变换矩阵
    public static void setCamera(// 设置摄像机
                                 float cx, // 摄像机位置x
                                 float cy, // 摄像机位置y
                                 float cz, // 摄像机位置z
                                 float tx, // 摄像机目标点x
                                 float ty, // 摄像机目标点y
                                 float tz, // 摄像机目标点z
                                 float upx, // 摄像机UP向量X分量
                                 float upy, // 摄像机UP向量Y分量
                                 float upz // 摄像机UP向量Z分量
    ) {
        Matrix.setLookAtM(mVMatrix, 0, cx, cy, cz, tx, ty, tz, upx, upy, upz);
    }
    public static void setProjectFrustum(// 设置透视投影参数
                                         float left, // near面的left
                                         float right, // near面的right
                                         float bottom, // near面的bottom
                                         float top, // near面的top
                                         float near, // near面距离
                                         float far // far面距离
    ) {
        Matrix.frustumM(mProjMatrix, 0, left, right, bottom, top, near, far);
    }
    public static void setProjectOrtho(// 设置正交投影参数
                                       float left, // near面的left
                                       float right, // near面的right
                                       float bottom, // near面的bottom
                                       float top, // near面的top
                                       float near, // near面距离
                                       float far // far面距离
    ) {
        Matrix.orthoM(mProjMatrix, 0, left, right, bottom, top, near, far);
    }
    public static float[] getFinalMatrix(float[] spec) {// 获取具体物体的总变换矩阵
        mMVPMatrix = new float[16];
        Matrix.multiplyMM(mMVPMatrix, 0, mVMatrix, 0, spec, 0);
        Matrix.multiplyMM(mMVPMatrix, 0, mProjMatrix, 0, mMVPMatrix, 0);
        return mMVPMatrix;
    }
}

