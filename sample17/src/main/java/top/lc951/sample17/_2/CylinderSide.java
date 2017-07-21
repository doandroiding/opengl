package top.lc951.sample17._2;

import android.opengl.GLES20;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/**
 * Created by lichong on 2017/7/21.
 *
 * @ Email lichongmac@163.com
 */

class CylinderSide {
    int mProgram;//自定义渲染管线程序id
    int muMVPMatrixHandle;//总变换矩阵引用id
    int muMMatrixHandle;//位置、旋转变换矩阵
    int uTexHandle;//外观纹理属性引用id

    int maCameraHandle; //摄像机位置属性引用id
    int maPositionHandle; //顶点位置属性引用id
    int maTexCoorHandle; //顶点纹理坐标属性引用id

    String mVertexShader;//顶点着色器
    String mFragmentShader;//片元着色器

    private FloatBuffer vertexBuffer;//顶点坐标数据缓冲
    private FloatBuffer   textureBuffer;//顶点纹理数据缓冲

    int vCount=0;//顶点个数
    float angdegSpan;//每个三角形顶角
    float xAngle=0;//绕z轴旋转的角度
    float yAngle=0;//绕y轴旋转的角度
    float zAngle=0;//绕z轴旋转的角度
    public CylinderSide(float r, float h, int n,int mProgram) {//大小，半径，高度，边数
        this.mProgram=mProgram;
        angdegSpan=360.0f/n;
        vCount=3*n*4;//顶点个数，共有3*n*4个三角形，每个三角形都有三个顶点
        //坐标数据初始化
        float[] vertices=new float[vCount*3];
        float[] textures=new float[vCount*2];//顶点纹理S、T坐标值数组
        float[] normals = new float[vCount*3];//法向量
        //坐标数据初始化
        int count=0;
        int stCount=0;
        int normalCount=0;
        for(float angdeg=0;Math.ceil(angdeg)<360;angdeg+=angdegSpan)//侧面
        {

            double angrad=Math.toRadians(angdeg);//当前弧度
            double angradNext=Math.toRadians(angdeg+angdegSpan);//下一弧度
            //底圆当前点---0
            vertices[count++]=(float) (-r*Math.sin(angrad));
            vertices[count++]=0;
            vertices[count++]=(float) (-r*Math.cos(angrad));

            normals[normalCount++]=(float) (-r*Math.sin(angrad));
            normals[normalCount++]=0;
            normals[normalCount++]=(float) (-r*Math.cos(angrad));

            textures[stCount++]=(float) (angrad/(2*Math.PI));//st坐标
            textures[stCount++]=1;
            //顶圆下一点---3
            vertices[count++]=(float) (-r*Math.sin(angradNext));
            vertices[count++]=h;
            vertices[count++]=(float) (-r*Math.cos(angradNext));

            normals[normalCount++]=(float) (-r*Math.sin(angradNext));
            normals[normalCount++]=0;
            normals[normalCount++]=(float) (-r*Math.cos(angradNext));

            textures[stCount++]=(float) (angradNext/(2*Math.PI));//st坐标
            textures[stCount++]=0;
            //顶圆当前点---2
            vertices[count++]=(float) (-r*Math.sin(angrad));
            vertices[count++]=h;
            vertices[count++]=(float) (-r*Math.cos(angrad));

            normals[normalCount++]=(float)(-r*Math.sin(angrad));
            normals[normalCount++]=0;
            normals[normalCount++]=(float)(-r*Math.cos(angrad));

            textures[stCount++]=(float) (angrad/(2*Math.PI));//st坐标
            textures[stCount++]=0;

            //底圆当前点---0
            vertices[count++]=(float) (-r*Math.sin(angrad));
            vertices[count++]=0;
            vertices[count++]=(float) (-r*Math.cos(angrad));

            normals[normalCount++]=(float)(-r*Math.sin(angrad));
            normals[normalCount++]=0;
            normals[normalCount++]=(float)(-r*Math.cos(angrad));

            textures[stCount++]=(float) (angrad/(2*Math.PI));//st坐标
            textures[stCount++]=1;
            //底圆下一点---1
            vertices[count++]=(float) (-r*Math.sin(angradNext));
            vertices[count++]=0;
            vertices[count++]=(float) (-r*Math.cos(angradNext));

            normals[normalCount++]=(float)(-r*Math.sin(angradNext));
            normals[normalCount++]=0;
            normals[normalCount++]=(float)(-r*Math.cos(angradNext));

            textures[stCount++]=(float) (angradNext/(2*Math.PI));//st坐标
            textures[stCount++]=1;
            //顶圆下一点---3
            vertices[count++]=(float) (-r*Math.sin(angradNext));
            vertices[count++]=h;
            vertices[count++]=(float) (-r*Math.cos(angradNext));

            normals[normalCount++]=(float)(-r*Math.sin(angradNext));
            normals[normalCount++]=0;
            normals[normalCount++]=(float)(-r*Math.cos(angradNext));

            textures[stCount++]=(float) (angradNext/(2*Math.PI));//st坐标
            textures[stCount++]=0;
        }
        ByteBuffer vbb = ByteBuffer.allocateDirect(vertices.length*4);//创建顶点坐标数据缓冲
        vbb.order(ByteOrder.nativeOrder());//设置字节顺序
        vertexBuffer = vbb.asFloatBuffer();//转换为float型缓冲
        vertexBuffer.put(vertices);//向缓冲区中放入顶点坐标数据
        vertexBuffer.position(0);//设置缓冲区起始位置

        //st坐标数据初始化
        ByteBuffer cbb = ByteBuffer.allocateDirect(textures.length*4);//创建顶点纹理数据缓冲
        cbb.order(ByteOrder.nativeOrder());//设置字节顺序
        textureBuffer = cbb.asFloatBuffer();//转换为float型缓冲
        textureBuffer.put(textures);//向缓冲区中放入顶点纹理数据
        textureBuffer.position(0);//设置缓冲区起始位置
    }

    //初始化shader
    public void intShader(MySurfaceView mv)
    {
        //获取程序中顶点位置属性引用id
        maPositionHandle = GLES20.glGetAttribLocation(mProgram, "aPosition");
        //获取程序中顶点经纬度属性引用id
        maTexCoorHandle=GLES20.glGetAttribLocation(mProgram, "aTexCoor");
        //获取程序中总变换矩阵引用id
        muMVPMatrixHandle = GLES20.glGetUniformLocation(mProgram, "uMVPMatrix");
        //获取位置、旋转变换矩阵引用id
        muMMatrixHandle = GLES20.glGetUniformLocation(mProgram, "uMMatrix");
        //获取程序中摄像机位置引用id
        maCameraHandle=GLES20.glGetUniformLocation(mProgram, "uCamera");
        uTexHandle=GLES20.glGetUniformLocation(mProgram, "sTexture");
    }

    public void drawSelf(int texId)
    {
        //制定使用某套shader程序
        GLES20.glUseProgram(mProgram);
        //将最终变换矩阵传入shader程序
        GLES20.glUniformMatrix4fv(muMVPMatrixHandle, 1, false, MatrixState.getFinalMatrix(), 0);
        //将位置、旋转变换矩阵传入shader程序
        GLES20.glUniformMatrix4fv(muMMatrixHandle, 1, false, MatrixState.getMMatrix(), 0);
        //将摄像机位置传入shader程序
        GLES20.glUniform3fv(maCameraHandle, 1, MatrixState.cameraFB);

        //为画笔指定顶点位置数据
        GLES20.glVertexAttribPointer
                (
                        maPositionHandle,
                        3,
                        GLES20.GL_FLOAT,
                        false,
                        3*4,
                        vertexBuffer
                );
        //为画笔指定顶点纹理坐标数据
        GLES20.glVertexAttribPointer
                (
                        maTexCoorHandle,
                        2,
                        GLES20.GL_FLOAT,
                        false,
                        2*4,
                        textureBuffer
                );
        //允许顶点位置数据数组
        GLES20.glEnableVertexAttribArray(maPositionHandle);
        GLES20.glEnableVertexAttribArray(maTexCoorHandle);
        //绑定纹理
        GLES20.glActiveTexture(GLES20.GL_TEXTURE0);
        GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, texId);
        GLES20.glUniform1i(uTexHandle, 0);

        //绘制三角形
        GLES20.glDrawArrays(GLES20.GL_TRIANGLES, 0, vCount);
    }
}
