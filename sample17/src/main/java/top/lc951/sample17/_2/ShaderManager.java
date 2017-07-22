package top.lc951.sample17._2;

import android.content.res.Resources;

import top.lc951.sample17.utils.ShaderUtil;

/**
 * Created by lichong on 2017/7/21.
 *
 * @ Email lichongmac@163.com
 */

class ShaderManager {
    final static int shaderCount=1;
    final static String[][] shaderName=
            {
                    {"vertex.sh","frag.sh"}
            };
    static String[]mVertexShader=new String[shaderCount];
    static String[]mFragmentShader=new String[shaderCount];
    static int[] program=new int[shaderCount];

    public static void loadCodeFromFile(Resources r)
    {
        for(int i=0;i<shaderCount;i++)
        {
            //加载顶点着色器的脚本内容
            mVertexShader[i]= ShaderUtil.loadFromAssetsFile(shaderName[i][0],r);
            //加载片元着色器的脚本内容
            mFragmentShader[i]=ShaderUtil.loadFromAssetsFile(shaderName[i][1], r);
        }
    }

    //编译3D物体的shader
    public static void compileShader()
    {
        for(int i=0;i<shaderCount;i++)
        {
            program[i]=ShaderUtil.createProgram(mVertexShader[i], mFragmentShader[i]);
            System.out.println("mProgram "+program[i]);
        }
    }
    //这里返回的是纹理的shader程序
    public static int getTextureShaderProgram()
    {
        return program[0];
    }
    //这里返回的是颜色的shader程序
    public static int getColorShaderProgram()
    {
        return program[1];
    }
    public static int[] getPrograms(){
        return program;
    }
}