package top.lc951.sample8._7;

import android.opengl.GLES20;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import top.lc951.sample8.utils.ShaderUtil;

import static top.lc951.sample8.utils.ShaderUtil.createProgram;

/**
 * @author lichong_951@163.com
 * @version V1.0
 * @Description: TODO
 * @date 2017/7/12  23:09
 * @powered by lichong
 */

public class Texture {
    int mProgram;//自定义渲染管线着色器程序id
    int muMVPMatrixHandle;//总变换矩阵引用
    int maPositionHandle; //顶点位置属性引用
    int maTexCoorHandle; //顶点纹理坐标属性引用

    String mVertexShader;//顶点着色器代码脚本
    String mFragmentShader;//片元着色器代码脚本

    FloatBuffer mVertexBuffer;//顶点坐标数据缓冲
    FloatBuffer   mTexCoorBuffer;//顶点纹理坐标数据缓冲

    int vCount=0;
    float xAngle=0;//绕x轴旋转的角度
    float yAngle=0;//绕y轴旋转的角度
    float zAngle=0;//绕z轴旋转的角度

    public Texture(MySurfaceView mv,float scale,float a, float b, int nS, int nT)
    {
        //调用初始化顶点数据的initVertexData方法
        initVertexData(scale,a,b,nS,nT);
        //调用初始化着色器的intShader方法
        initShader(mv);
    }

    //自定义的初始化顶点数据的方法
    public void initVertexData(float scale,float a, float b, int nS, int nT) {

        a*=scale;
        b*=scale;
        float xOffset=a/2;
        float yOffset=b/2;
        vCount=6;
        //坐标数据初始化
        float[] vertices=new float[]{
                -xOffset,-yOffset,0,
                xOffset,yOffset,0,
                -xOffset,yOffset,0,

                -xOffset,-yOffset,0,
                xOffset,-yOffset,0,
                xOffset,yOffset,0
        };
        ByteBuffer vbb = ByteBuffer.allocateDirect(vertices.length*4);//创建顶点坐标数据缓冲
        vbb.order(ByteOrder.nativeOrder());//设置字节顺序
        mVertexBuffer = vbb.asFloatBuffer();//转换为float型缓冲
        mVertexBuffer.put(vertices);//向缓冲区中放入顶点坐标数据
        mVertexBuffer.position(0);//设置缓冲区起始位置

        float[] textures={
                0,1, 1,0, 0,0,
                0,1, 1,1, 1,0
        };
        //创建顶点着色数据缓冲
        ByteBuffer cbb = ByteBuffer.allocateDirect(textures.length*4);
        cbb.order(ByteOrder.nativeOrder());//设置字节顺序为本地操作系统顺序
        mTexCoorBuffer = cbb.asFloatBuffer();//转换为Float型缓冲
        mTexCoorBuffer.put(textures);//向缓冲区中放入顶点着色数据
        mTexCoorBuffer.position(0);//设置缓冲区起始位置
    }

    //自定义初始化着色器initShader方法
    public void initShader(MySurfaceView mv)
    {
        //加载顶点着色器的脚本内容
        mVertexShader= ShaderUtil.loadFromAssetsFile("vertex_tex_7.sh", mv.getResources());
        //加载片元着色器的脚本内容
        mFragmentShader=ShaderUtil.loadFromAssetsFile("frag_tex_7.sh", mv.getResources());
        //基于顶点着色器与片元着色器创建程序
        mProgram = createProgram(mVertexShader, mFragmentShader);
        //获取程序中顶点位置属性引用id
        maPositionHandle = GLES20.glGetAttribLocation(mProgram, "aPosition");
        //获取程序中顶点纹理坐标属性引用id
        maTexCoorHandle= GLES20.glGetAttribLocation(mProgram, "aTexCoor");
        //获取程序中总变换矩阵引用id
        muMVPMatrixHandle = GLES20.glGetUniformLocation(mProgram, "uMVPMatrix");
    }

    public void drawSelf(int texId)
    {
        MatrixState.rotate(xAngle, 1, 0, 0);
        MatrixState.rotate(yAngle, 0, 1, 0);
        MatrixState.rotate(zAngle, 0, 0, 1);

        //制定使用某套shader程序
        GLES20.glUseProgram(mProgram);

        //将最终变换矩阵传入shader程序
        GLES20.glUniformMatrix4fv(muMVPMatrixHandle, 1, false, MatrixState.getFinalMatrix(), 0);

        //传送顶点位置数据
        GLES20.glVertexAttribPointer
                (
                        maPositionHandle,
                        3,
                        GLES20.GL_FLOAT,
                        false,
                        3*4,
                        mVertexBuffer
                );
        //传送顶点纹理坐标数据
        GLES20.glVertexAttribPointer
                (
                        maTexCoorHandle,
                        2,
                        GLES20.GL_FLOAT,
                        false,
                        2*4,
                        mTexCoorBuffer
                );

        //启用顶点位置数据
        GLES20.glEnableVertexAttribArray(maPositionHandle);
        //启用顶点纹理数据
        GLES20.glEnableVertexAttribArray(maTexCoorHandle);

        //绑定纹理
        GLES20.glActiveTexture(GLES20.GL_TEXTURE0);
        GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, texId);

        //绘制纹理矩形
        GLES20.glDrawArrays(GLES20.GL_TRIANGLES, 0, vCount);
    }
}
