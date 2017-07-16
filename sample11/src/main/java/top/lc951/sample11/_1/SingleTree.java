package top.lc951.sample11._1;


import static top.lc951.sample11._1.MySurfaceView.cx;
import static top.lc951.sample11._1.MySurfaceView.cz;

/**
 * Created by lichong on 2017/7/16.
 *
 * @ Email lichongmac@163.com
 */

 class SingleTree implements Comparable<SingleTree> {
    float x;
    float z;
    float yAngle;
    TreeGroup tg;
    public SingleTree(float x,float z,float yAngle,TreeGroup tg)
    {
        this.x=x;
        this.z=z;
        this.yAngle=yAngle;
        this.tg=tg;
    }
    public void drawSelf(int texId)
    {
        MatrixState.pushMatrix();
        MatrixState.translate(x, 0, z);
        MatrixState.rotate(yAngle, 0, 1, 0);
        tg.tfd.drawSelf(texId);
        MatrixState.popMatrix();
    }
    public void calculateBillboardDirection()
    {//根据摄像机位置计算树木面朝向
        float xspan=x-cx;
        float zspan=z-cz;

        if(zspan<=0)
        {
            yAngle=(float)Math.toDegrees(Math.atan(xspan/zspan));
        }
        else
        {
            yAngle=180+(float)Math.toDegrees(Math.atan(xspan/zspan));
        }
    }
    @Override
    public int compareTo(SingleTree another)
    {
        //重写的比较两个树木离摄像机距离的方法
        float xs=x-cx;
        float zs=z-cz;

        float xo=another.x-cx;
        float zo=another.z-cz;

        float disA=(float)Math.sqrt(xs*xs+zs*zs);
        float disB=(float)Math.sqrt(xo*xo+zo*zo);

        return ((disA-disB)==0)?0:((disA-disB)>0)?-1:1;
    }
}
