precision mediump float;
uniform highp vec3 uLightLocation;//光源位置
uniform highp mat4 uMMatrix; //变换矩阵
uniform vec3 uCamera;	//摄像机位置
uniform vec3 uColor;    //顶点颜色
uniform highp int isShadow;			//阴影绘制标志

varying vec3 vPosition;//接收从顶点着色器过来的顶点位置
varying vec3 vNormal;//接收从顶点着色器过来的顶点法向量

//定位光光照计算的方法
void pointLight(					//定位光光照计算的方法
  in vec3 normal,				//法向量
  inout vec4 ambient,			//环境光最终强度
  inout vec4 diffuse,				//散射光最终强度
  inout vec4 specular,			//镜面光最终强度
  in vec3 lightLocation,			//光源位置
  in vec4 lightAmbient,			//环境光强度
  in vec4 lightDiffuse,			//散射光强度
  in vec4 lightSpecular			//镜面光强度
){
  ambient=lightAmbient;			//直接得出环境光的最终强度
  vec3 normalTarget=vPosition+normal;	//计算变换后的法向量
  vec3 newNormal=(uMMatrix*vec4(normalTarget,1)).xyz-(uMMatrix*vec4(vPosition,1)).xyz;
  newNormal=normalize(newNormal); 	//对法向量规格化
  //计算从表面点到摄像机的向量
  vec3 eye= normalize(uCamera-(uMMatrix*vec4(vPosition,1)).xyz);
  //计算从表面点到光源位置的向量vp
  vec3 vp= normalize(lightLocation-(uMMatrix*vec4(vPosition,1)).xyz);
  vec3 halfVector=normalize(vp+eye);	//求视线与光线的半向量
  float shininess=50.0;				//粗糙度，越小越光滑
  float nDotViewPosition=max(0.0,dot(newNormal,vp)); 	//求法向量与vp的点积与0的最大值
  diffuse=lightDiffuse*nDotViewPosition;				//计算散射光的最终强度
  float nDotViewHalfVector=dot(newNormal,halfVector);	//法线与半向量的点积
  float powerFactor=max(0.0,pow(nDotViewHalfVector,shininess)); 	//镜面反射光强度因子
  specular=lightSpecular*powerFactor;    			//计算镜面光的最终强度
}
void main()
{
	if(isShadow==0) {//不是阴影
   		vec4 baseColor=vec4(uColor,1.0);//基本颜色
   		vec4 ambient, diffuse, specular;
  		pointLight(normalize(vNormal),ambient,diffuse,specular,uLightLocation,
   				vec4(0.15,0.15,0.15,1.0),vec4(0.9,0.9,0.9,1.0),vec4(0.7,0.7,0.7,1.0));
   		gl_FragColor = baseColor*diffuse + baseColor*specular + baseColor*ambient;
   	} else {//是阴影
   		vec4 baseColor = vec4(0.2,0.8,0.2,1.0);//基本颜色
   		gl_FragColor = baseColor*vec4(0.15,0.15,0.15,1.0);//片元最终颜色为阴影的颜色
   	}
}     