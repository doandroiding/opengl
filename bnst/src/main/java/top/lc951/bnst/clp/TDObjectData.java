package top.lc951.bnst.clp;

import static top.lc951.bnst.clp.Constant_clp.LAND_MAX_HIGHEST;
import static top.lc951.bnst.clp.Constant_clp.UNIT_SIZE;
import static top.lc951.bnst.clp.Constant_clp.WATER_HIGH_ADJUST;

/**
 * Created by lichong on 2017/7/24.
 *
 * @ Email lichongmac@163.com
 */
//3D物件数据类
public class TDObjectData {
    //游戏中3D物体的相关数据列表
    static float[][] PART_LIST=new float[][]
            {
                    //==================桥=======================
                    //==================桥=======================
                    {0,UNIT_SIZE*6f,WATER_HIGH_ADJUST,UNIT_SIZE*2f-15f,-90,2,6},//桥
                    {0,UNIT_SIZE*14f,WATER_HIGH_ADJUST,UNIT_SIZE*2f-15f,-90,2,14},//桥
                    {0,UNIT_SIZE*4f,WATER_HIGH_ADJUST,UNIT_SIZE*29f-15f,-90,29,4},//桥
                    {0,UNIT_SIZE*25f-15f,WATER_HIGH_ADJUST,UNIT_SIZE*3f,0,3,25},//桥
                    {0,UNIT_SIZE*29f-15f,WATER_HIGH_ADJUST,UNIT_SIZE*4f,0,4,29},//桥
                    {0,UNIT_SIZE*11f-15f,WATER_HIGH_ADJUST,UNIT_SIZE*6f,0,6,11},//桥
                    {0,UNIT_SIZE*20f-15f,WATER_HIGH_ADJUST,UNIT_SIZE*10f,0,10,20},//桥
                    {0,UNIT_SIZE*11f-15f,WATER_HIGH_ADJUST,UNIT_SIZE*11f-20,0,11,11},//桥
                    {0,UNIT_SIZE*1f-15f,WATER_HIGH_ADJUST,UNIT_SIZE*17f,0,17,1},//桥
                    {0,UNIT_SIZE*24f-15f,WATER_HIGH_ADJUST,UNIT_SIZE*22f,0,22,24},//桥
                    {0,UNIT_SIZE*15f-15f,WATER_HIGH_ADJUST,UNIT_SIZE*25f,0,25,15},//桥
                    {0,UNIT_SIZE*24f-15f,WATER_HIGH_ADJUST,UNIT_SIZE*27f,0,27,24},//桥
                    {0,UNIT_SIZE*0f-15f,WATER_HIGH_ADJUST,UNIT_SIZE*2f,0,2,0},//桥
                    {0,UNIT_SIZE*1f,WATER_HIGH_ADJUST,UNIT_SIZE*0f-15f,-90,0,1},//桥

                    //新添加的桥的数据
                    //2-10 横
                    {0,UNIT_SIZE*10f,WATER_HIGH_ADJUST,UNIT_SIZE*2f-15f,-90,2,10},
                    //13-14 横
                    {0,UNIT_SIZE*14f+15,WATER_HIGH_ADJUST,UNIT_SIZE*13f-15f,-90,13,14},
                    //13-18 横
                    {0,UNIT_SIZE*18f+15,WATER_HIGH_ADJUST,UNIT_SIZE*13f-15f,-90,13,18},
                    //5-20 竖
                    {0,UNIT_SIZE*20f-15f,WATER_HIGH_ADJUST,UNIT_SIZE*5f+15,0,5,20},
                    //13-25 竖
                    {0,UNIT_SIZE*25f-15f,WATER_HIGH_ADJUST,UNIT_SIZE*13f,0,13,25},
                    //18-25 竖
                    {0,UNIT_SIZE*25f-15f,WATER_HIGH_ADJUST,UNIT_SIZE*18f-15,0,18,25},
                    //20-12 横
                    {0,UNIT_SIZE*12f+15,WATER_HIGH_ADJUST,UNIT_SIZE*20f-15f,-90,20,12},
                    //24-2 竖
                    {0,UNIT_SIZE*2f-15f,WATER_HIGH_ADJUST,UNIT_SIZE*24f+20,0,24,2},
                    //24-1 竖
                    {0,UNIT_SIZE*1f-15f,WATER_HIGH_ADJUST,UNIT_SIZE*24f,0,24,1},
                    //==================桥=======================

                    //=================隧道=======================
                    {1,UNIT_SIZE*2f,WATER_HIGH_ADJUST,0,-90,0,2},//横着的
                    {1,UNIT_SIZE*26f,WATER_HIGH_ADJUST,UNIT_SIZE*8f,0,8,26},
                    {1,UNIT_SIZE*16f,WATER_HIGH_ADJUST,UNIT_SIZE*22f,0,22,16},
                    {1,UNIT_SIZE*17f,WATER_HIGH_ADJUST,UNIT_SIZE*28f,-90,28,17},
                    {1,UNIT_SIZE*2f,WATER_HIGH_ADJUST,UNIT_SIZE*10f,0,10,2},
                    //=================隧道=======================

                    //==================山=======================
                    {2,UNIT_SIZE*2f,LAND_MAX_HIGHEST-1,UNIT_SIZE+10,0,2,2},//山
                    {2,UNIT_SIZE*5f,LAND_MAX_HIGHEST-1,UNIT_SIZE*0+10,0,0,5},
                    {2,UNIT_SIZE*3f,LAND_MAX_HIGHEST-1,UNIT_SIZE*2+10,0,2,3},
                    {2,UNIT_SIZE*8f,LAND_MAX_HIGHEST-1,UNIT_SIZE*4+10,0,4,8},
                    {2,UNIT_SIZE*9f,LAND_MAX_HIGHEST-1,UNIT_SIZE*1,0,1,9},
                    {2,UNIT_SIZE*15f,LAND_MAX_HIGHEST-1,UNIT_SIZE*1,0,1,15},
                    {2,UNIT_SIZE*10f,LAND_MAX_HIGHEST-1,UNIT_SIZE*7+10,0,7,10},
                    {2,UNIT_SIZE*10f,LAND_MAX_HIGHEST-1,UNIT_SIZE*11+10,0,11,10},
                    {2,UNIT_SIZE*14f,LAND_MAX_HIGHEST-1,UNIT_SIZE*14+10,0,14,14},
                    {2,UNIT_SIZE*17f,LAND_MAX_HIGHEST-1,UNIT_SIZE*12,0,12,17},
                    {2,UNIT_SIZE*19f,LAND_MAX_HIGHEST-1,UNIT_SIZE*7+10,0,7,19},
                    {2,UNIT_SIZE*23f,LAND_MAX_HIGHEST-1,UNIT_SIZE*4,0,4,23},
                    {2,UNIT_SIZE*29f,LAND_MAX_HIGHEST-1,UNIT_SIZE*6+10,0,6,29},
                    {2,UNIT_SIZE*25f,LAND_MAX_HIGHEST-1,UNIT_SIZE*11,0,11,25},
                    {2,UNIT_SIZE*27f,LAND_MAX_HIGHEST-1,UNIT_SIZE*17+10,0,17,27},
                    {2,UNIT_SIZE*23f,LAND_MAX_HIGHEST-1,UNIT_SIZE*22+10,0,22,23},
                    {2,UNIT_SIZE*23f,LAND_MAX_HIGHEST-1,UNIT_SIZE*30+10,0,30,23},
                    {2,UNIT_SIZE*19f,LAND_MAX_HIGHEST-1,UNIT_SIZE*30+10,0,30,19},
                    {2,UNIT_SIZE*16f,LAND_MAX_HIGHEST-1,UNIT_SIZE*25+10,0,25,16},
                    {2,UNIT_SIZE*13f,LAND_MAX_HIGHEST-1,UNIT_SIZE*19,0,19,13},
                    {2,UNIT_SIZE*12f,LAND_MAX_HIGHEST-1,UNIT_SIZE*23+10,0,23,12},
                    {2,UNIT_SIZE*8f,LAND_MAX_HIGHEST-1,UNIT_SIZE*29+10,0,29,8},
                    {2,UNIT_SIZE*4f,LAND_MAX_HIGHEST-1,UNIT_SIZE*30+10,0,30,4},
                    {2,UNIT_SIZE*0f,LAND_MAX_HIGHEST-1,UNIT_SIZE*26+10,0,26,0},
                    {2,UNIT_SIZE*3f,LAND_MAX_HIGHEST-1,UNIT_SIZE*21,0,21,3},
                    {2,UNIT_SIZE*0f,LAND_MAX_HIGHEST-1,UNIT_SIZE*16+10,0,16,0},
                    {2,UNIT_SIZE*1f,LAND_MAX_HIGHEST-1,UNIT_SIZE*11+10,0,11,1},
                    {2,UNIT_SIZE*3f,LAND_MAX_HIGHEST-1,UNIT_SIZE*9+10,0,9,3},
                    {2,UNIT_SIZE*3f,LAND_MAX_HIGHEST-1,UNIT_SIZE*5+10,0,5,3},
                    {2,UNIT_SIZE*1f,LAND_MAX_HIGHEST-1,UNIT_SIZE*4+10,0,4,1},
                    {2,UNIT_SIZE*14f,LAND_MAX_HIGHEST-1,UNIT_SIZE*3,0,3,14},
                    {2,UNIT_SIZE*14f,LAND_MAX_HIGHEST-1,UNIT_SIZE*5+10,0,5,14},
                    {2,UNIT_SIZE*11f,LAND_MAX_HIGHEST-1,UNIT_SIZE*8,0,8,11},
                    {2,UNIT_SIZE*12f,LAND_MAX_HIGHEST-1,UNIT_SIZE*10+10,0,10,12},
                    {2,UNIT_SIZE*10f,LAND_MAX_HIGHEST-1,UNIT_SIZE*13+10,0,13,10},
                    {2,UNIT_SIZE*14f,LAND_MAX_HIGHEST-1,UNIT_SIZE*12,0,12,14},
                    {2,UNIT_SIZE*20f,LAND_MAX_HIGHEST-1,UNIT_SIZE*13+10,0,13,20},
                    {2,UNIT_SIZE*19f,LAND_MAX_HIGHEST-1,UNIT_SIZE*11,0,11,19},
                    {2,UNIT_SIZE*19f,LAND_MAX_HIGHEST-1,UNIT_SIZE*4+10,0,4,19},
                    {2,UNIT_SIZE*26f,LAND_MAX_HIGHEST-1,UNIT_SIZE*5,0,5,26},
                    {2,UNIT_SIZE*30f,LAND_MAX_HIGHEST-1,UNIT_SIZE*2,0,2,30},
                    {2,UNIT_SIZE*28f,LAND_MAX_HIGHEST-1,UNIT_SIZE*11+10,0,11,28},
                    {2,UNIT_SIZE*24f,LAND_MAX_HIGHEST-1,UNIT_SIZE*13+10,0,13,24},
                    {2,UNIT_SIZE*24f,LAND_MAX_HIGHEST-1,UNIT_SIZE*19+10,0,19,24},
                    {2,UNIT_SIZE*27f,LAND_MAX_HIGHEST-1,UNIT_SIZE*22+10,0,22,27},
                    {2,UNIT_SIZE*26f,LAND_MAX_HIGHEST-1,UNIT_SIZE*25+10,0,25,26},
                    {2,UNIT_SIZE*25f,LAND_MAX_HIGHEST-1,UNIT_SIZE*27+10,0,27,25},
                    {2,UNIT_SIZE*20f,LAND_MAX_HIGHEST-1,UNIT_SIZE*27,0,27,20},
                    {2,UNIT_SIZE*14f,LAND_MAX_HIGHEST-1,UNIT_SIZE*27+10,0,27,14},
                    {2,UNIT_SIZE*15f,LAND_MAX_HIGHEST-1,UNIT_SIZE*21+10,0,21,15},
                    {2,UNIT_SIZE*10f,LAND_MAX_HIGHEST-1,UNIT_SIZE*22,0,22,10},
                    {2,UNIT_SIZE*8f,LAND_MAX_HIGHEST-1,UNIT_SIZE*26,0,26,8},
                    {2,UNIT_SIZE*3f,LAND_MAX_HIGHEST-1,UNIT_SIZE*28,0,28,3},
                    {2,UNIT_SIZE*1f,LAND_MAX_HIGHEST-1,UNIT_SIZE*23+10,0,23,1},
                    {2,UNIT_SIZE*3f,LAND_MAX_HIGHEST-1,UNIT_SIZE*15+10,0,15,3},
                    {2,UNIT_SIZE*1f,LAND_MAX_HIGHEST-1,UNIT_SIZE*7+10,0,7,1},
                    //==================山=======================

                    //================半崖子=======================
                    {3,UNIT_SIZE*4-26f,WATER_HIGH_ADJUST,UNIT_SIZE*1,0,1,4},//半崖子
                    {3,UNIT_SIZE*12f,WATER_HIGH_ADJUST,UNIT_SIZE*2-26f,-90,2,12},
                    {3,UNIT_SIZE*13f,WATER_HIGH_ADJUST,UNIT_SIZE*2-26f,-90,2,13},
                    {3,UNIT_SIZE*12f-26f,WATER_HIGH_ADJUST,UNIT_SIZE*8,0,8,12},
                    {3,UNIT_SIZE*21f-26f,WATER_HIGH_ADJUST,UNIT_SIZE*8,0,8,21},
                    {3,UNIT_SIZE*27f,WATER_HIGH_ADJUST,UNIT_SIZE*2-26f,-90,2,27},
                    {3,UNIT_SIZE*27f,WATER_HIGH_ADJUST,UNIT_SIZE*6-26f,-90,6,27},
                    {3,UNIT_SIZE*26f-26f,WATER_HIGH_ADJUST,UNIT_SIZE*16,0,16,26},
                    {3,UNIT_SIZE*24f-26f,WATER_HIGH_ADJUST,UNIT_SIZE*24,0,24,24},
                    {3,UNIT_SIZE*15f,WATER_HIGH_ADJUST,UNIT_SIZE*20-26f,-90,20,15},
                    {3,UNIT_SIZE*12f,WATER_HIGH_ADJUST,UNIT_SIZE*20-26f,-90,20,12},
                    {3,UNIT_SIZE*10f-26f,WATER_HIGH_ADJUST,UNIT_SIZE*25,0,25,10},
                    {3,UNIT_SIZE*2f-26f,WATER_HIGH_ADJUST,UNIT_SIZE*27,0,27,2},
                    {3,UNIT_SIZE*1f-26f,WATER_HIGH_ADJUST,UNIT_SIZE*20,0,20,1},
                    {3,UNIT_SIZE*2f-26f,WATER_HIGH_ADJUST,UNIT_SIZE*6,0,6,2},
                    {3,UNIT_SIZE*2f-26f,WATER_HIGH_ADJUST,UNIT_SIZE*9,0,9,2},
                    //2-5 直道0半崖子
                    {3,UNIT_SIZE*5f,WATER_HIGH_ADJUST,UNIT_SIZE*2-26f,-90,2,5},
                    //3-15  直道1半崖子
                    {3,UNIT_SIZE*15-26f,WATER_HIGH_ADJUST,UNIT_SIZE*3,0,3,15},//半崖子
                    //10-11  直道1半崖子
                    {3,UNIT_SIZE*11-26f,WATER_HIGH_ADJUST,UNIT_SIZE*10,0,10,11},//半崖子
                    //5-22  直道0半崖子
                    {3,UNIT_SIZE*22f,WATER_HIGH_ADJUST,UNIT_SIZE*5-26f,-90,5,22},
                    //4-25  直道1半崖子
                    {3,UNIT_SIZE*25-26f,WATER_HIGH_ADJUST,UNIT_SIZE*4,0,4,25},
                    //13-17直道0半崖子
                    {3,UNIT_SIZE*17f,WATER_HIGH_ADJUST,UNIT_SIZE*13-26f,-90,13,17},
                    //5-20直道1半崖子
                    {3,UNIT_SIZE*20-26f,WATER_HIGH_ADJUST,UNIT_SIZE*5,0,5,20},
                    //29-6直道1半崖子
                    {3,UNIT_SIZE*6-26f,WATER_HIGH_ADJUST,UNIT_SIZE*29,0,29,6},

                    //0-0弯道4 半崖子
                    {3,UNIT_SIZE*0f-10,WATER_HIGH_ADJUST,UNIT_SIZE*0-5,-45,0,0},
                    //0-4弯道5半崖子
                    {3,UNIT_SIZE*4+13f,WATER_HIGH_ADJUST,UNIT_SIZE*0-5,-150,0,4},

                    //新添加的飞艇=======================================================
                    //2-6
                    {4,UNIT_SIZE*6f,UNIT_SIZE-15,UNIT_SIZE*2,-60,2,6},
                    //2-11
                    {4,UNIT_SIZE*11f,UNIT_SIZE-15,UNIT_SIZE*2,-60,2,11},
                    //4-11
                    {4,UNIT_SIZE*11f,UNIT_SIZE-15,UNIT_SIZE*4,-60,4,11},
                    //7-12
                    {4,UNIT_SIZE*12f,UNIT_SIZE-15,UNIT_SIZE*7,-60,7,12},
                    //12-12
                    {4,UNIT_SIZE*12f,UNIT_SIZE-15,UNIT_SIZE*12,-60,12,12},
                    //14-16
                    {4,UNIT_SIZE*16f,UNIT_SIZE-15,UNIT_SIZE*14,-60,14,16},
                    //7-20
                    {4,UNIT_SIZE*20f,UNIT_SIZE-15,UNIT_SIZE*7,-60,7,20},
                    //4-25
                    {4,UNIT_SIZE*25f,UNIT_SIZE-15,UNIT_SIZE*4,-60,4,25},
                    //4-29
                    {4,UNIT_SIZE*29f,UNIT_SIZE-15,UNIT_SIZE*4,-60,4,29},
                    //10-26
                    {4,UNIT_SIZE*26f,UNIT_SIZE-15,UNIT_SIZE*10,-60,10,26},
                    //15-26
                    {4,UNIT_SIZE*26f,UNIT_SIZE-15,UNIT_SIZE*15,-60,15,26},
                    //19-26
                    {4,UNIT_SIZE*26f,UNIT_SIZE-15,UNIT_SIZE*19,-60,19,26},
                    //24-24
                    {4,UNIT_SIZE*24f,UNIT_SIZE-15,UNIT_SIZE*24,-60,24,24},
                    //29-24
                    {4,UNIT_SIZE*24f,UNIT_SIZE-15,UNIT_SIZE*29,-60,29,24},
                    //20-16
                    {4,UNIT_SIZE*16f,UNIT_SIZE-15,UNIT_SIZE*20,-60,20,16},
                    //20-11
                    {4,UNIT_SIZE*11f,UNIT_SIZE-15,UNIT_SIZE*20,-60,20,11},
                    //25-10
                    {4,UNIT_SIZE*10f,UNIT_SIZE-15,UNIT_SIZE*25,-60,25,10},
                    //28-6
                    {4,UNIT_SIZE*6f,UNIT_SIZE-15,UNIT_SIZE*28,-60,28,6},
                    //26-2
                    {4,UNIT_SIZE*2f,UNIT_SIZE-15,UNIT_SIZE*26,-60,26,2},
                    //18-2
                    {4,UNIT_SIZE*2f,UNIT_SIZE-15,UNIT_SIZE*18,-60,18,2},
                    //13-2
                    {4,UNIT_SIZE*2f,UNIT_SIZE-15,UNIT_SIZE*13,-60,13,2},
                    //7-3
                    {4,UNIT_SIZE*3f,UNIT_SIZE-15,UNIT_SIZE*7,-60,7,3},

                    //广告牌子
                    //2-7 竖着的
                    {5,UNIT_SIZE*7f-20,LAND_MAX_HIGHEST-5,UNIT_SIZE*2+23,0,2,7},
                    //4-14
                    {5,UNIT_SIZE*14f-20,LAND_MAX_HIGHEST-5,UNIT_SIZE*4-23,0,4,14},
                    //5-22
                    {5,UNIT_SIZE*22f,LAND_MAX_HIGHEST-5,UNIT_SIZE*5-23,0,5,22},
                    //2-28
                    {5,UNIT_SIZE*28f,LAND_MAX_HIGHEST-5,UNIT_SIZE*2+23,0,2,28},
                    //14-25竖着的1
                    {5,UNIT_SIZE*25f+23,LAND_MAX_HIGHEST-5,UNIT_SIZE*14,0,14,25},
                    //18-25
                    {5,UNIT_SIZE*25f-23,LAND_MAX_HIGHEST-5,UNIT_SIZE*18,0,18,25},
                    //22-25
                    {5,UNIT_SIZE*25f-23,LAND_MAX_HIGHEST-5,UNIT_SIZE*22-20,0,22,25},
                    //28-16
                    {5,UNIT_SIZE*16f-20,LAND_MAX_HIGHEST-5,UNIT_SIZE*28-23,0,28,16},
                    //28-10
                    {5,UNIT_SIZE*10f-23,LAND_MAX_HIGHEST-5,UNIT_SIZE*28,0,28,10},
                    //24-2
                    {5,UNIT_SIZE*2f-23,LAND_MAX_HIGHEST-5,UNIT_SIZE*24-20,0,24,2},
                    //12-2
                    {5,UNIT_SIZE*2f-23,LAND_MAX_HIGHEST-5,UNIT_SIZE*12,0,12,2},
                    //2-10
                    {5,UNIT_SIZE*10f,LAND_MAX_HIGHEST-5,UNIT_SIZE*2-23,0,2,10},
                    //2-13
                    {5,UNIT_SIZE*13f+20,LAND_MAX_HIGHEST-5,UNIT_SIZE*2-23,0,2,13},
                    //13-14
                    {5,UNIT_SIZE*14f,LAND_MAX_HIGHEST-5,UNIT_SIZE*13-23,0,13,14},
                    //3-25
                    {5,UNIT_SIZE*25f-23,LAND_MAX_HIGHEST-5,UNIT_SIZE*3-20,0,3,25},
                    //6-27
                    {5,UNIT_SIZE*27f,LAND_MAX_HIGHEST-5,UNIT_SIZE*6+23,0,6,27},
                    //20-26
                    {5,UNIT_SIZE*26f-23,LAND_MAX_HIGHEST-5,UNIT_SIZE*20-20,0,20,26},
                    //22-24
                    {5,UNIT_SIZE*24f+23,LAND_MAX_HIGHEST-5,UNIT_SIZE*22,0,22,24},

                    //新添加的
                    //0-0      弯道4外侧
                    {5,UNIT_SIZE*0f-10,LAND_MAX_HIGHEST-8,UNIT_SIZE*0-5,0,0,0},
                    //2-4      弯道6外侧
                    {5,UNIT_SIZE*4f-10,LAND_MAX_HIGHEST-8,UNIT_SIZE*2+5,0,2,4},
                    //2-8      弯道5外侧
                    {5,UNIT_SIZE*8f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*2-5,0,2,8},
                    //3-9      弯道7外侧
                    {5,UNIT_SIZE*9f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*3+5,0,3,9},
                    //2-15      弯道5外侧
                    {5,UNIT_SIZE*15f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*2-5,0,2,15},
                    //4-15     弯道7内测
                    {5,UNIT_SIZE*15f-25,LAND_MAX_HIGHEST-8,UNIT_SIZE*4-25,0,4,15},
                    //14-16      弯道7外侧
                    {5,UNIT_SIZE*16f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*14+5,0,14,16},
                    //12-20     弯道7外侧
                    {5,UNIT_SIZE*20f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*12+5,0,12,20},
                    //7-21      弯道5外侧
                    {5,UNIT_SIZE*21f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*7-5,0,7,21},
                    //4-21      弯道5外侧
                    {5,UNIT_SIZE*21f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*4-5,0,4,21},
                    //5-25     弯道7外侧
                    {5,UNIT_SIZE*25f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*5+5,0,5,25},
                    //2-29      弯道5外侧
                    {5,UNIT_SIZE*29f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*2-5,0,2,29},
                    //6-28    弯道7外侧
                    {5,UNIT_SIZE*28f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*6+5,0,6,28},
                    //10-26      弯道6外侧
                    {5,UNIT_SIZE*26f-10,LAND_MAX_HIGHEST-8,UNIT_SIZE*10+5,0,10,26},
                    //11-27    弯道7外侧
                    {5,UNIT_SIZE*27f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*11+5,0,11,27},
                    //15-25      弯道6外侧
                    {5,UNIT_SIZE*25f-10,LAND_MAX_HIGHEST-8,UNIT_SIZE*15+5,0,15,25},
                    //17-26   弯道7外侧
                    {5,UNIT_SIZE*26f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*17+5,0,17,26},
                    //23-26   弯道7外侧
                    {5,UNIT_SIZE*26f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*23+5,0,23,26},
                    //21-25     弯道5外侧
                    {5,UNIT_SIZE*25f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*21-5,0,21,25},
                    //26-25   弯道7外侧
                    {5,UNIT_SIZE*25f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*26+5,0,26,25},
                    //29-24   弯道7外侧
                    {5,UNIT_SIZE*24f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*29+5,0,29,24},
                    //28-23     弯道5外侧
                    {5,UNIT_SIZE*23f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*28-5,0,28,23},
                    //28-21     弯道5外侧
                    {5,UNIT_SIZE*21f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*28-5,0,28,21},
                    //29-19      弯道6外侧
                    {5,UNIT_SIZE*19f-10,LAND_MAX_HIGHEST-8,UNIT_SIZE*29+5,0,29,19},
                    //24-16    弯道7外侧
                    {5,UNIT_SIZE*16f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*24+5,0,24,16},
                    //20-11      弯道4外侧
                    {5,UNIT_SIZE*11f-10,LAND_MAX_HIGHEST-8,UNIT_SIZE*20-5,0,20,11},
                    //26-9     弯道4外侧
                    {5,UNIT_SIZE*9f-10,LAND_MAX_HIGHEST-8,UNIT_SIZE*26-5,0,26,9},
                    //28-6     弯道4外侧
                    {5,UNIT_SIZE*6f-10,LAND_MAX_HIGHEST-8,UNIT_SIZE*28-5,0,28,6},
                    //29-2      弯道6外侧
                    {5,UNIT_SIZE*2f-10,LAND_MAX_HIGHEST-8,UNIT_SIZE*29+5,0,29,2},
                    //23-3    弯道7外侧
                    {5,UNIT_SIZE*3f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*23+5,0,23,3},
                    //21-1      弯道6外侧
                    {5,UNIT_SIZE*1f-10,LAND_MAX_HIGHEST-8,UNIT_SIZE*21+5,0,21,1},
                    //19-2    弯道7外侧
                    {5,UNIT_SIZE*2f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*19+5,0,19,2},
                    //15-2    弯道7外侧
                    {5,UNIT_SIZE*2f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*15+5,0,15,2},
                    //8-3    弯道7外侧
                    {5,UNIT_SIZE*3f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*8+5,0,8,3},
                    //3-2      弯道5外侧
                    {5,UNIT_SIZE*2f+10,LAND_MAX_HIGHEST-8,UNIT_SIZE*3-5,0,3,2},
                    //新添加的

                    //船埠头
                    //2-5  横着的、上侧
                    {6,UNIT_SIZE*5f-21,0,UNIT_SIZE*2-15,90,2,5},
                    //2-6   横着的、下侧
                    {6,UNIT_SIZE*6f-13,0,UNIT_SIZE*2+15,-90,2,6},
                    //2-10  横着的、上侧
                    {6,UNIT_SIZE*10f-19,0,UNIT_SIZE*2-15,90,2,10},
                    //2-12  横着的、上侧
                    {6,UNIT_SIZE*12f-21,0,UNIT_SIZE*2-15,90,2,12},
                    //2-13   横着的、下侧
                    {6,UNIT_SIZE*13f-10,0,UNIT_SIZE*2+15,-90,2,13},
                    //2-14   横着的、下侧
                    {6,UNIT_SIZE*14f-7,0,UNIT_SIZE*2+15,-90,2,14},
                    //3-15	竖着的、左侧
                    {6,UNIT_SIZE*15f-15,0,UNIT_SIZE*3,180,3,15},
                    {6,UNIT_SIZE*15f-15,0,UNIT_SIZE*3+3,180,3,15},
                    //4-13   横着的、下侧
                    {6,UNIT_SIZE*13f-10,0,UNIT_SIZE*4+15,-90,4,13},
                    //5-11	竖着的、左侧
                    {6,UNIT_SIZE*11f-15,0,UNIT_SIZE*5,180,5,11},
                    //6-11	竖着的、右侧
                    {6,UNIT_SIZE*11f+15,0,UNIT_SIZE*6,0,6,11},
                    //10-11	竖着的、左侧
                    {6,UNIT_SIZE*11f-15,0,UNIT_SIZE*10,180,10,11},
                    //12-11	竖着的、右侧
                    {6,UNIT_SIZE*11f+15,0,UNIT_SIZE*12,0,12,11},
                    //13-17   横着的、下侧
                    {6,UNIT_SIZE*17f-7,0,UNIT_SIZE*13+15,-90,13,17},
                    //10-20	竖着的、右侧
                    {6,UNIT_SIZE*20f+15,0,UNIT_SIZE*10,0,10,20},
                    //8-21	竖着的、右侧
                    {6,UNIT_SIZE*21f+15,0,UNIT_SIZE*8,0,8,21},
                    //5-20	竖着的、右侧
                    {6,UNIT_SIZE*20f+15,0,UNIT_SIZE*5,0,5,20},
                    //5-22  横着的、上侧
                    {6,UNIT_SIZE*22f-7,0,UNIT_SIZE*5-15,90,5,22},
                    //5-23   横着的、下侧
                    {6,UNIT_SIZE*23f-7,0,UNIT_SIZE*5+15,-90,5,23},
                    //5-24   横着的、下侧
                    {6,UNIT_SIZE*24f-7,0,UNIT_SIZE*5+15,-90,5,24},
                    //2-26  横着的、上侧
                    {6,UNIT_SIZE*26f-7,0,UNIT_SIZE*2-15,90,2,26},
                    //2-27   横着的、下侧
                    {6,UNIT_SIZE*27f-7,0,UNIT_SIZE*2+15,-90,2,27},
                    //2-28   横着的、下侧
                    {6,UNIT_SIZE*28f-7,0,UNIT_SIZE*2+15,-90,2,28},
                    //3-29	竖着的、左侧
                    {6,UNIT_SIZE*29f-15,0,UNIT_SIZE*3,180,3,29},
                    //6-27   横着的、下侧
                    {6,UNIT_SIZE*27f-7,0,UNIT_SIZE*6+15,-90,6,27},
                    //7-26	竖着的、左侧
                    {6,UNIT_SIZE*26f-15,0,UNIT_SIZE*7,180,7,26},
                    //9-26	竖着的、右侧
                    {6,UNIT_SIZE*26f+15,0,UNIT_SIZE*9,0,9,26},
                    //13-25	竖着的、右侧
                    {6,UNIT_SIZE*25f+15,0,UNIT_SIZE*13,0,13,25},
                    //16-26	竖着的、右侧
                    {6,UNIT_SIZE*26f+15,0,UNIT_SIZE*16,0,16,26},
                    //21-26	竖着的、右侧
                    {6,UNIT_SIZE*26f+15,0,UNIT_SIZE*21,0,21,26},
                    //22-25	竖着的、左侧
                    {6,UNIT_SIZE*25f-15,0,UNIT_SIZE*22,180,22,25},
                    //24-24	竖着的、左侧
                    {6,UNIT_SIZE*24f-15,0,UNIT_SIZE*24+3,180,24,24},
                    //24-28	竖着的、左侧
                    {6,UNIT_SIZE*28f-15,0,UNIT_SIZE*24,180,24,28},
                    //28-16  横着的、上侧
                    {6,UNIT_SIZE*16f-7,0,UNIT_SIZE*28-15,90,28,16},
                    //28-18   横着的、下侧
                    {6,UNIT_SIZE*18f-7,0,UNIT_SIZE*28+15,-90,28,18},
                    //25-15	竖着的、右侧
                    {6,UNIT_SIZE*15f+15,0,UNIT_SIZE*25,0,25,15},
                    //26-15	竖着的、左侧
                    {6,UNIT_SIZE*15f-15,0,UNIT_SIZE*26,180,26,15},
                    //23-16	竖着的、右侧
                    {6,UNIT_SIZE*16f+15,0,UNIT_SIZE*23,0,23,16},
                    //21-16	竖着的、左侧
                    {6,UNIT_SIZE*16f-15,0,UNIT_SIZE*21,180,21,16},
                    //20-15  横着的、上侧
                    {6,UNIT_SIZE*15f-7,0,UNIT_SIZE*20-15,90,20,15},
                    //20-14   横着的、下侧
                    {6,UNIT_SIZE*14f-7,0,UNIT_SIZE*20+15,-90,20,14},
                    //21-11	竖着的、右侧
                    {6,UNIT_SIZE*11f+15,0,UNIT_SIZE*21,0,21,11},
                    //22-11	竖着的、右侧
                    {6,UNIT_SIZE*11f+15,0,UNIT_SIZE*22,0,22,11},
                    //24-10	竖着的、右侧
                    {6,UNIT_SIZE*10f+15,0,UNIT_SIZE*24,0,24,10},
                    //25-10	竖着的、右侧
                    {6,UNIT_SIZE*10f+15,0,UNIT_SIZE*25,0,25,10},
                    //29-3  横着的、上侧
                    {6,UNIT_SIZE*3f-7,0,UNIT_SIZE*29-15,90,29,3},
                    //29-4   横着的、下侧
                    {6,UNIT_SIZE*4f-10,0,UNIT_SIZE*29+15,-90,29,4},
                    //16-1	竖着的、右侧
                    {6,UNIT_SIZE*1f+15,0,UNIT_SIZE*16,0,16,1},
                    //17-1	竖着的、右侧
                    {6,UNIT_SIZE*1f+15,0,UNIT_SIZE*17,0,22,1},
                    //11-2	竖着的、右侧
                    {6,UNIT_SIZE*2f+15,0,UNIT_SIZE*11,0,11,2},
                    //21-16	竖着的、左侧
                    {6,UNIT_SIZE*2f-15,0,UNIT_SIZE*9,180,9,2},
                    //5-2	竖着的、右侧
                    {6,UNIT_SIZE*2f+15,0,UNIT_SIZE*5,0,5,2},
                    //6-2	竖着的、右侧
                    {6,UNIT_SIZE*2f+15,0,UNIT_SIZE*6,0,6,2},
                    //新添加的，船埠头

                    //城堡数据
                    //2-7  横
                    {7,UNIT_SIZE*7f,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*2-35,0,2,7},
                    //2-11  横
                    {7,UNIT_SIZE*11f,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*2-35,0,2,11},
                    //2-13  横
                    {7,UNIT_SIZE*13f,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*2-35,0,2,13},
                    //3-15  竖道
                    {7,UNIT_SIZE*15f-35,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*3,0,3,15},
                    //4-13  横
                    {7,UNIT_SIZE*13f,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*4-35,0,4,13},
                    //12-12  弯道4
                    {7,UNIT_SIZE*12f-17,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*12-17,0,12,12},
                    //14-16  弯道7
                    {7,UNIT_SIZE*16f+17,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*14+17,0,14,16},
                    //10-20  竖直
                    {7,UNIT_SIZE*20f+35,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*10,0,10,20},
                    //9-20  弯道4
                    {7,UNIT_SIZE*20f-17,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*9-17,0,9,20},
                    //8-21  竖直
                    {7,UNIT_SIZE*21f+35,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*8,0,8,21},
                    //4-21 弯道5
                    {7,UNIT_SIZE*21f+17,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*4-17,0,4,21},
                    //5-22  横道
                    {7,UNIT_SIZE*22f,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*5-35,0,5,22},
                    //5-24  横道
                    {7,UNIT_SIZE*24f,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*5-35,0,5,24},
                    //2-26  横道
                    {7,UNIT_SIZE*26f,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*2-35,0,2,26},
                    //2-28  横道
                    {7,UNIT_SIZE*28f,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*2-35,0,2,28},
                    //6-27  横道
                    {7,UNIT_SIZE*27f,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*6-35,0,6,27},
                    //7-26  竖直
                    {7,UNIT_SIZE*26f+35,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*7,0,7,26},
                    //9-26  竖直
                    {7,UNIT_SIZE*26f-35,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*9,0,9,26},
                    //15-26 弯道5
                    {7,UNIT_SIZE*26f+17,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*15-17,0,15,26},
                    //17-25  弯道4
                    {7,UNIT_SIZE*25f-17,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*17-17,0,17,25},
                    //20-26  竖直
                    {7,UNIT_SIZE*26f-35,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*20,0,20,26},
                    //21-24  弯道4
                    {7,UNIT_SIZE*24f-17,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*21-17,0,21,24},
                    //21-26  竖直
                    {7,UNIT_SIZE*26f+35,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*21,0,21,26},
                    //23-24  竖直
                    {7,UNIT_SIZE*24f-35,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*23,0,23,24},
                    //24-24  竖直
                    {7,UNIT_SIZE*24f-35,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*24,0,24,24},
                    //26-24  弯道4
                    {7,UNIT_SIZE*24f-17,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*26-17,0,26,24},
                    //27-24  竖直
                    {7,UNIT_SIZE*24f-35,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*27,0,27,24},
                    //28-22  弯道4
                    {7,UNIT_SIZE*22f-17,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*28-17,0,28,22},
                    //29-20  弯道7
                    {7,UNIT_SIZE*20f+17,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*29+17,0,29,20},
                    //24-15  弯道4
                    {7,UNIT_SIZE*15f-17,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*24-17,0,24,15},
                    //20-14  横道
                    {7,UNIT_SIZE*14f,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*20-35,0,20,14},
                    //24-10  竖直
                    {7,UNIT_SIZE*10f-35,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*24,0,24,10},
                    //28-6  弯道4
                    {7,UNIT_SIZE*6f-17,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*28-17,0,28,6},
                    //30-6  弯道7
                    {7,UNIT_SIZE*6f+17,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*30+17,0,30,6},
                    //27-1 竖直
                    {7,UNIT_SIZE*1-35,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*27,0,27,1},
                    //24-2 竖直
                    {7,UNIT_SIZE*2+35,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*24,0,24,2},
                    //20-1 竖直
                    {7,UNIT_SIZE*1-35,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*20,0,20,1},
                    //17-2 竖直
                    {7,UNIT_SIZE*2+35,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*17,0,17,2},
                    //13-1 弯道4
                    {7,UNIT_SIZE*1f-17,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*13-17,0,13,1},
                    //12-2 竖直
                    {7,UNIT_SIZE*2+35,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*12,0,12,2},
                    //2-0竖直
                    {7,UNIT_SIZE*0-35,LAND_MAX_HIGHEST+0.4f,UNIT_SIZE*2,0,2,0},
                    //新添加的，城堡
            };
}