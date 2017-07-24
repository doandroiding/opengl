package top.lc951.sample18._6;

import android.opengl.Matrix;

import static top.lc951.sample18._6.Constant_6.XBOUNDARY;
import static top.lc951.sample18._6.Constant_6.ZBOUNDARY;

/**
 * Created by lichong@7moor.com on 2017/7/23.
 */

class BallForControl {
    MySurfaceView_6 mv;
    Ball ball;//用于绘制的桌球

    float rotateX;		//球的旋转轴
    float rotateY;
    float rotateZ;

    float tempX;	//球位置的临时变量
    float tempZ;

    float tempSPANX;	//球移动距离的临时变量
    float tempSPANZ;

    float tempLength;	//球前进的距离临时变量

    float tempAngle;	//球旋转的角度

    float[] selfRotateMatrix;//自带旋转矩阵

    public BallForControl(MySurfaceView_6 mv, float scale, float aHalf, int n)
    {
        this.mv=mv;
        ball=new Ball(mv,scale,aHalf,n);
        //初始化自带旋转矩阵
        selfRotateMatrix=new float[16];
        //初始时旋转一定的度数
        Matrix.setRotateM(selfRotateMatrix, 0, 10, 0, 1, 0);
    }

    public void drawSelf()
    {
        MatrixState.pushMatrix();
        //移动到指定位置
        MatrixState.translate(Constant_6.XOFFSET, 1.2f, Constant_6.ZOFFSET);
        //加上自带旋转矩阵
        MatrixState.matrix(selfRotateMatrix);
        //绘制球
        ball.drawSelf();
        MatrixState.popMatrix();
    }

    //球前进的方法
    public void go(){
        tempSPANX= Constant_6.SPANX;	//球移动距离的临时变量赋值
        tempSPANZ= Constant_6.SPANZ;

        tempX= Constant_6.XOFFSET+tempSPANX;	//根据传感器，变化当前球的位置
        tempZ= Constant_6.ZOFFSET+tempSPANZ;


        //如果与上下两条边发生碰撞
        if( (tempZ<-ZBOUNDARY)||(tempZ>ZBOUNDARY))
        {
            tempSPANZ=0;
        }
        //如果与左右两条边发生碰撞
        if((tempX<-XBOUNDARY)|| (tempX>XBOUNDARY))
        {
            tempSPANX=0;
        }


        //球当前的位置发生变化
        Constant_6.XOFFSET+=tempSPANX;
        Constant_6.ZOFFSET+=tempSPANZ;


        //*****************旋转 begin************************

        //前进的方向向量为Constant.SPANX Constant.SPANZ，
        //那么旋转轴为
        rotateX=tempSPANZ;
        rotateY=0;
        rotateZ=-tempSPANX;
        //前进的距离
        tempLength=(float) Math.sqrt(tempSPANX*tempSPANX+tempSPANZ*tempSPANZ);
        //计算前进的角度值
        tempAngle=(float) Math.toDegrees(tempLength/ Constant_6.BALLR);

        //改变球的旋转矩阵
        //旋转时要求角度不为0且轴不能全为0
        if(Math.abs(tempAngle)!=0&&(Math.abs(rotateZ)!=0||Math.abs(rotateX)!=0))
        {
            float[] newMatrix=new float[16];
            Matrix.setRotateM(newMatrix, 0, tempAngle, rotateX, rotateY, rotateZ);
            float[] resultMatrix=new float[16];
            Matrix.multiplyMM(resultMatrix, 0, newMatrix, 0, selfRotateMatrix,0);
            selfRotateMatrix=resultMatrix;
        }

        //************************旋转 end************************
    }
}