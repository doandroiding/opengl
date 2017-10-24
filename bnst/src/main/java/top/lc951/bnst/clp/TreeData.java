package top.lc951.bnst.clp;

import static top.lc951.bnst.clp.Constant_clp.UNIT_SIZE;
import static top.lc951.bnst.clp.Constant_clp.WATER_HIGH_ADJUST;

/**
 * Created by lichong on 2017/7/24.
 *
 * @ Email lichongmac@163.com
 */

public class TreeData {
    //树的相关数据列表
    static float[][] Tree_Data=new float[][]
            {
                    //2-28横
                    {3,	UNIT_SIZE*28f+10, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+UNIT_SIZE/3, 2, 28},	//树4
                    {3,	UNIT_SIZE*28f+10, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+-UNIT_SIZE/3, 2, 28},	//树4
                    {3,	UNIT_SIZE*28f+30, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+UNIT_SIZE/3, 2, 28},	//树4
                    {3,	UNIT_SIZE*28f+30, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+-UNIT_SIZE/3, 2, 28},	//树4
                    //2-26横
                    {3,	UNIT_SIZE*26f+10, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+UNIT_SIZE/3, 2, 26},	//树4
                    {3,	UNIT_SIZE*26f+10, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+-UNIT_SIZE/3, 2, 26},	//树4
                    {3,	UNIT_SIZE*26f+30, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+UNIT_SIZE/3, 2, 26},	//树4
                    {3,	UNIT_SIZE*26f+30, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+-UNIT_SIZE/3, 2, 26},	//树4
                    //2-5横
                    {3,	UNIT_SIZE*5f+10, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+UNIT_SIZE/3, 2, 5},	//树4
                    {3,	UNIT_SIZE*5f+10, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+-UNIT_SIZE/3, 2, 5},	//树4
                    {3,	UNIT_SIZE*5f+30, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+UNIT_SIZE/3, 2, 5},	//树4
                    {3,	UNIT_SIZE*5f+30, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+-UNIT_SIZE/3, 2, 5},	//树4
                    //13-18
                    {3,	UNIT_SIZE*18f+10, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13+UNIT_SIZE/3, 13, 18},	//树4
                    {3,	UNIT_SIZE*18f+10, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13+-UNIT_SIZE/3, 13, 18},	//树4
                    {3,	UNIT_SIZE*18f+30, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13+UNIT_SIZE/3, 13, 18},	//树4
                    {3,	UNIT_SIZE*18f+30, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13+-UNIT_SIZE/3, 13, 18},	//树4
                    //0-3横
                    {0, UNIT_SIZE*2f+45, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE/3, 0, 3},	//树1
                    {0, UNIT_SIZE*2f+45, WATER_HIGH_ADJUST+1.5f, -UNIT_SIZE/3, 0, 3},	//树1
                    {1,	UNIT_SIZE*2f+65, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE/3, 0, 3},	//树2
                    {1,	UNIT_SIZE*2f+65, WATER_HIGH_ADJUST+1.5f, -UNIT_SIZE/3, 0, 3},	//树2
                    {0,	UNIT_SIZE*2f+85, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE/3, 0, 3},	//树3
                    {0,	UNIT_SIZE*2f+85, WATER_HIGH_ADJUST+1.5f, -UNIT_SIZE/3, 0, 3},	//树3


                    //0-0弯道4
                    {3,	UNIT_SIZE*0f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*0-10, 0, 0},	//树4
                    {3,	UNIT_SIZE*0f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*0+10, 0, 0},	//树4
                    //2-9
                    {3,	UNIT_SIZE*9f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2-10, 2, 9},	//树4
                    {3,	UNIT_SIZE*9f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+10, 2, 9},	//树4
                    //4-11
                    {3,	UNIT_SIZE*11f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4-10, 4, 11},	//树4
                    {3,	UNIT_SIZE*11f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+10, 4, 11},	//树4
                    //9-11
                    {3,	UNIT_SIZE*11f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*9-10, 9, 11},	//树4
                    {3,	UNIT_SIZE*11f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*9+10, 9, 11},	//树4
                    //12-12
                    {3,	UNIT_SIZE*12f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*12-10, 12, 12},	//树4
                    {3,	UNIT_SIZE*12f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*12+10, 12, 12},	//树4
                    //13-16
                    {3,	UNIT_SIZE*16f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13-10, 13, 16},	//树4
                    {3,	UNIT_SIZE*16f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13+10, 13, 16},	//树4
                    //12-19
                    {3,	UNIT_SIZE*19f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*12-10, 12, 19},	//树4
                    {3,	UNIT_SIZE*19f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*12+10, 12, 19},	//树4
                    //9-20
                    {3,	UNIT_SIZE*20f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*9-10, 9, 20},	//树4
                    {3,	UNIT_SIZE*20f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*9+10, 9, 20},	//树4
                    //4-20
                    {3,	UNIT_SIZE*20f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4-10, 4, 20},	//树4
                    {3,	UNIT_SIZE*20f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+10, 4, 20},	//树4
                    //2-25
                    {3,	UNIT_SIZE*25f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2-10, 2, 25},	//树4
                    {3,	UNIT_SIZE*25f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+10, 2, 25},	//树4
                    //5-28
                    {3,	UNIT_SIZE*28f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*5-10, 5, 28},	//树4
                    {3,	UNIT_SIZE*28f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*5+10, 5, 28},	//树4
                    //6-26
                    {3,	UNIT_SIZE*26f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*6-10, 6, 26},	//树4
                    {3,	UNIT_SIZE*26f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*6+10, 6, 26},	//树4
                    //11-26
                    {3,	UNIT_SIZE*26f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*11-10, 11, 26},	//树4
                    {3,	UNIT_SIZE*26f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*11+10, 11, 26},	//树4
                    //12-25
                    {3,	UNIT_SIZE*25f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*12-10, 12, 25},	//树4
                    {3,	UNIT_SIZE*25f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*12+10, 12, 25},	//树4
                    //17-25
                    {3,	UNIT_SIZE*25f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*17-10, 17, 25},	//树4
                    {3,	UNIT_SIZE*25f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*17+10, 17, 25},	//树4
                    //21-24
                    {3,	UNIT_SIZE*24f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*21-10, 21, 24},	//树4
                    {3,	UNIT_SIZE*24f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*21+10, 21, 24},	//树4
                    //26-24
                    {3,	UNIT_SIZE*24f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*26-10, 26, 24},	//树4
                    {3,	UNIT_SIZE*24f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*26+10, 26, 24},	//树4
                    //28-22
                    {3,	UNIT_SIZE*22f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*28-10, 28, 22},	//树4
                    {3,	UNIT_SIZE*22f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*28+10, 28, 22},	//树4
                    //28-20
                    {3,	UNIT_SIZE*20f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*28-10, 28, 20},	//树4
                    {3,	UNIT_SIZE*20f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*28+10, 28, 20},	//树4
                    //24-15
                    {3,	UNIT_SIZE*15f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*24-10, 24, 15},	//树4
                    {3,	UNIT_SIZE*15f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*24+10, 24, 15},	//树4
                    //20-11
                    {3,	UNIT_SIZE*11f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*20-10, 20, 11},	//树4
                    {3,	UNIT_SIZE*11f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*20+10, 20, 11},	//树4
                    //23-10
                    {3,	UNIT_SIZE*10f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*23-10, 23, 10},	//树4
                    {3,	UNIT_SIZE*10f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*23+10, 23, 10},	//树4
                    //26-9
                    {3,	UNIT_SIZE*9f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*26-10, 26, 9},	//树4
                    {3,	UNIT_SIZE*9f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*26+10, 26, 9},	//树4
                    //27-8
                    {3,	UNIT_SIZE*8f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*27-10, 27, 8},	//树4
                    {3,	UNIT_SIZE*8f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*27+10, 27, 8},	//树4
                    //28-6
                    {3,	UNIT_SIZE*6f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*28-10, 28, 6},	//树4
                    {3,	UNIT_SIZE*6f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*28+10, 28, 6},	//树4
                    //25-1
                    {3,	UNIT_SIZE*1f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*25-10, 25, 1},	//树4
                    {3,	UNIT_SIZE*1f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*25+10, 25, 1},	//树4
                    //23-2
                    {3,	UNIT_SIZE*2f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*23-10, 23, 2},	//树4
                    {3,	UNIT_SIZE*2f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*23+10, 23, 2},	//树4
                    //19-1
                    {3,	UNIT_SIZE*1f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*19-10, 19, 1},	//树4
                    {3,	UNIT_SIZE*1f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*19+10, 19, 1},	//树4
                    //15-1
                    {3,	UNIT_SIZE*1f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*15-10, 15, 1},	//树4
                    {3,	UNIT_SIZE*1f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*15+10, 15, 1},	//树4
                    //13-1
                    {3,	UNIT_SIZE*1f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13-10, 13, 1},	//树4
                    {3,	UNIT_SIZE*1f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13+10, 13, 1},	//树4
                    //8-2
                    {3,	UNIT_SIZE*2f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*8-10, 8, 2},	//树4
                    {3,	UNIT_SIZE*2f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*8+10, 8, 2},	//树4

                    //弯道5的数据=============================================================
                    //0-4弯道5
                    {2,	UNIT_SIZE*4f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*0-10, 0, 4},	//树4
                    {2,	UNIT_SIZE*4f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*0+10, 0, 4},	//树4
                    //2-8
                    {2,	UNIT_SIZE*8f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2-10, 2, 8},	//树4
                    {2,	UNIT_SIZE*8f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+10, 2, 8},	//树4
                    //2-15
                    {2,	UNIT_SIZE*15f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2-10, 2, 15},	//树4
                    {2,	UNIT_SIZE*15f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+10, 2, 15},	//树4
                    //7-12
                    {2,	UNIT_SIZE*12f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*7-10, 7, 12},	//树4
                    {2,	UNIT_SIZE*12f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*7+10, 7, 12},	//树4
                    //12-13
                    {2,	UNIT_SIZE*13f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*12-10, 12, 13},	//树4
                    {2,	UNIT_SIZE*13f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*12+10, 12, 13},	//树4
                    //13-15
                    {2,	UNIT_SIZE*15f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13-10, 13, 15},	//树4
                    {2,	UNIT_SIZE*15f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13+10, 13, 15},	//树4
                    //7-21
                    {2,	UNIT_SIZE*21f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*7-10, 7, 21},	//树4
                    {2,	UNIT_SIZE*21f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*7+10, 7, 21},	//树4
                    //4-21
                    {2,	UNIT_SIZE*21f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4-10, 4, 21},	//树4
                    {2,	UNIT_SIZE*21f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+10, 4, 21},	//树4
                    //2-29
                    {2,	UNIT_SIZE*29f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2-10, 2, 29},	//树4
                    {2,	UNIT_SIZE*29f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+10, 2, 29},	//树4
                    //10-28
                    {2,	UNIT_SIZE*28f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*10-10, 10, 28},	//树4
                    {2,	UNIT_SIZE*28f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*10+10, 10, 28},	//树4
                    //15-26
                    {2,	UNIT_SIZE*26f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*15-10, 15, 26},	//树4
                    {2,	UNIT_SIZE*26f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*15+10, 15, 26},	//树4
                    //19-26
                    {2,	UNIT_SIZE*26f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*19-10, 19, 26},	//树4
                    {2,	UNIT_SIZE*26f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*19+10, 19, 26},	//树4
                    //21-25
                    {2,	UNIT_SIZE*25f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*21-10, 21, 25},	//树4
                    {2,	UNIT_SIZE*25f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*21+10, 21, 25},	//树4
                    //25-25
                    {2,	UNIT_SIZE*25f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*25-10, 25, 25},	//树4
                    {2,	UNIT_SIZE*25f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*25+10, 25, 25},	//树4
                    //28-23
                    {2,	UNIT_SIZE*23f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*28-10, 28, 23},	//树4
                    {2,	UNIT_SIZE*23f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*28+10, 28, 23},	//树4
                    //28-21
                    {2,	UNIT_SIZE*21f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*28-10, 28, 21},	//树4
                    {2,	UNIT_SIZE*21f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*28+10, 28, 21},	//树4
                    //28-19
                    {2,	UNIT_SIZE*19f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*28-10, 28, 19},	//树4
                    {2,	UNIT_SIZE*19f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*28+10, 28,19},	//树4
                    //20-16
                    {2,	UNIT_SIZE*16f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*20-10, 20, 16},	//树4
                    {2,	UNIT_SIZE*16f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*20+10, 20, 16},	//树4
                    //29-5
                    {2,	UNIT_SIZE*5f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29-10, 29, 5},	//树4
                    {2,	UNIT_SIZE*5f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29+10, 29, 5},	//树4
                    //26-2
                    {2,	UNIT_SIZE*2f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*26-10, 26, 2},	//树4
                    {2,	UNIT_SIZE*2f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*26+10, 26, 2},	//树4
                    //22-3
                    {2,	UNIT_SIZE*3f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*22-10, 22, 3},	//树4
                    {2,	UNIT_SIZE*3f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*22+10, 22, 3},	//树4
                    //21-2
                    {2,	UNIT_SIZE*2f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*21-10, 21, 2},	//树4
                    {2,	UNIT_SIZE*2f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*21+10, 21, 2},	//树4
                    //18-2
                    {2,	UNIT_SIZE*2f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*18-10, 18, 2},	//树4
                    {2,	UNIT_SIZE*2f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*18+10, 18, 2},	//树4
                    //14-2
                    {2,	UNIT_SIZE*2f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*14-10, 14, 2},	//树4
                    {2,	UNIT_SIZE*2f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*14+10, 14, 2},	//树4
                    //7-3
                    {2,	UNIT_SIZE*3f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*7-10, 7, 3},	//树4
                    {2,	UNIT_SIZE*3f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*7+10, 7, 3},	//树4
                    //3-2
                    {2,	UNIT_SIZE*2f-3, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*3-10, 3, 2},	//树4
                    {2,	UNIT_SIZE*2f+13, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*3+10, 3, 2},	//树4

                    //3-0弯道6========================
                    {3,	UNIT_SIZE*0f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*3+10, 3, 0},	//树4
                    {3,	UNIT_SIZE*0f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*3-10, 3, 0},	//树4
                    //2-4
                    {3,	UNIT_SIZE*4f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+10, 2, 4},	//树4
                    {3,	UNIT_SIZE*4f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2-10, 2, 4},	//树4
                    //3-8
                    {3,	UNIT_SIZE*8f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*3+10, 3, 8},	//树4
                    {3,	UNIT_SIZE*8f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*3-10, 3, 8},	//树4
                    //7-11
                    {3,	UNIT_SIZE*11f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*7+10, 7, 11},	//树4
                    {3,	UNIT_SIZE*11f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*7-10, 7, 11},	//树4
                    //13-11
                    {3,	UNIT_SIZE*11f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13+10, 13, 11},	//树4
                    {3,	UNIT_SIZE*11f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13-10, 13, 11},	//树4
                    //13-13
                    {3,	UNIT_SIZE*13f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13+10, 13, 13},	//树4
                    {3,	UNIT_SIZE*13f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13-10, 13, 13},	//树4
                    //14-15
                    {3,	UNIT_SIZE*15f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*14+10, 14, 15},	//树4
                    {3,	UNIT_SIZE*15f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*14-10, 14, 15},	//树4
                    //7-20
                    {3,	UNIT_SIZE*20f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*7+10, 7, 20},	//树4
                    {3,	UNIT_SIZE*20f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*7-10, 7, 20},	//树4
                    //5-21
                    {3,	UNIT_SIZE*21f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*5+10, 5, 21},	//树4
                    {3,	UNIT_SIZE*21f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*5-10, 5, 21},	//树4
                    //10-26
                    {3,	UNIT_SIZE*26f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*10+10, 10, 26},	//树4
                    {3,	UNIT_SIZE*26f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*10-10, 10, 26},	//树4
                    //15-25
                    {3,	UNIT_SIZE*25f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*15+10, 15, 25},	//树4
                    {3,	UNIT_SIZE*25f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*15-10, 15, 25},	//树4
                    //19-25
                    {3,	UNIT_SIZE*25f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*19+10, 19, 25},	//树4
                    {3,	UNIT_SIZE*25f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*19-10, 19, 25},	//树4
                    //23-25
                    {3,	UNIT_SIZE*25f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*23+10, 23, 25},	//树4
                    {3,	UNIT_SIZE*25f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*23-10, 23, 25},	//树4
                    //25-24
                    {3,	UNIT_SIZE*24f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*25+10, 25, 24},	//树4
                    {3,	UNIT_SIZE*24f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*25-10, 25, 24},	//树4
                    //29-23
                    {3,	UNIT_SIZE*23f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29+10, 29, 23},	//树4
                    {3,	UNIT_SIZE*23f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29-10, 29, 23},	//树4
                    //29-21
                    {3,	UNIT_SIZE*21f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29+10, 29, 21},	//树4
                    {3,	UNIT_SIZE*21f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29-10, 29, 21},	//树4
                    //29-19
                    {3,	UNIT_SIZE*19f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29+10, 29, 19},	//树4
                    {3,	UNIT_SIZE*19f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29-10, 29, 19},	//树4
                    //28-15
                    {3,	UNIT_SIZE*15f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*28+10, 28, 15},	//树4
                    {3,	UNIT_SIZE*15f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*28-10, 28, 15},	//树4
                    //30-5
                    {3,	UNIT_SIZE*5f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*30+10, 30, 5},	//树4
                    {3,	UNIT_SIZE*5f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*30-10, 30, 5},	//树4
                    //29-2
                    {3,	UNIT_SIZE*2f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29+10, 29, 2},	//树4
                    {3,	UNIT_SIZE*2f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29-10, 29, 2},	//树4
                    //26-1
                    {3,	UNIT_SIZE*1f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*26+10, 26, 1},	//树4
                    {3,	UNIT_SIZE*1f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*26-10, 26, 1},	//树4
                    //22-2
                    {3,	UNIT_SIZE*2f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*22+10, 22, 2},	//树4
                    {3,	UNIT_SIZE*2f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*22-10, 22, 2},	//树4
                    //21-1
                    {3,	UNIT_SIZE*1f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*21+10, 21, 1},	//树4
                    {3,	UNIT_SIZE*1f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*21-10, 21, 1},	//树4
                    //18-1
                    {3,	UNIT_SIZE*1f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*18+10, 18, 1},	//树4
                    {3,	UNIT_SIZE*1f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*18-10, 18, 1},	//树4
                    //14-1
                    {3,	UNIT_SIZE*1f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*14+10, 14, 1},	//树4
                    {3,	UNIT_SIZE*1f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*14-10, 14, 1},	//树4
                    //7-2
                    {3,	UNIT_SIZE*2f-4, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*7+10, 7, 2},	//树4
                    {3,	UNIT_SIZE*2f-19, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*7-10, 7, 2},	//树4

                    //3-9弯道7=========================
                    {3,	UNIT_SIZE*9f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*3+10, 3, 9},	//树4
                    {3,	UNIT_SIZE*9f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*3-10, 3, 9},	//树4
                    //4-16
                    {3,	UNIT_SIZE*16f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+10, 4, 16},	//树4
                    {3,	UNIT_SIZE*16f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4-10, 4, 16},	//树4
                    //9-12
                    {3,	UNIT_SIZE*12f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*9+10, 9, 12},	//树4
                    {3,	UNIT_SIZE*12f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*9-10, 9, 12},	//树4
                    //13-12
                    {3,	UNIT_SIZE*12f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13+10, 13, 12},	//树4
                    {3,	UNIT_SIZE*12f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13-10, 13, 12},	//树4
                    //14-16
                    {3,	UNIT_SIZE*16f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*14+10, 14, 16},	//树4
                    {3,	UNIT_SIZE*16f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*14-10, 14, 16},	//树4
                    //13-19
                    {3,	UNIT_SIZE*19f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13+10, 13, 19},	//树4
                    {3,	UNIT_SIZE*19f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13-10, 13, 19},	//树4
                    //12-20
                    {3,	UNIT_SIZE*20f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*12+10, 12, 20},	//树4
                    {3,	UNIT_SIZE*20f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*12-10, 12, 20},	//树4
                    //9-21
                    {3,	UNIT_SIZE*21f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*9+10, 9, 21},	//树4
                    {3,	UNIT_SIZE*21f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*9-10, 9, 21},	//树4
                    //5-25
                    {3,	UNIT_SIZE*25f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*5+10, 5, 25},	//树4
                    {3,	UNIT_SIZE*25f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*5-10, 5, 25},	//树4
                    //5-29
                    {3,	UNIT_SIZE*29f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*5+10, 5, 29},	//树4
                    {3,	UNIT_SIZE*29f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*5-10, 5, 29},	//树4
                    //6-28
                    {3,	UNIT_SIZE*28f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*6+10, 6, 28},	//树4
                    {3,	UNIT_SIZE*28f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*6-10, 6, 28},	//树4
                    //11-27
                    {3,	UNIT_SIZE*27f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*11+10, 11, 27},	//树4
                    {3,	UNIT_SIZE*27f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*11-10, 11, 27},	//树4
                    //12-26
                    {3,	UNIT_SIZE*26f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*12+10, 12, 26},	//树4
                    {3,	UNIT_SIZE*26f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*12-10, 12, 26},	//树4
                    //17-26
                    {3,	UNIT_SIZE*26f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*17+10, 17, 26},	//树4
                    {3,	UNIT_SIZE*26f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*17-10, 17, 26},	//树4
                    //23-26
                    {3,	UNIT_SIZE*26f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*23+10, 23, 26},	//树4
                    {3,	UNIT_SIZE*26f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*23-10, 23, 26},	//树4
                    //26-25
                    {3,	UNIT_SIZE*25f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*26+10, 26, 25},	//树4
                    {3,	UNIT_SIZE*25f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*26-10, 26, 25},	//树4
                    //29-24
                    {3,	UNIT_SIZE*24f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29+10, 29, 24},	//树4
                    {3,	UNIT_SIZE*24f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29-10, 29, 24},	//树4
                    //29-22
                    {3,	UNIT_SIZE*22f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29+10, 29, 22},	//树4
                    {3,	UNIT_SIZE*22f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29-10, 29, 22},	//树4
                    //29-20
                    {3,	UNIT_SIZE*20f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29+10, 29, 20},	//树4
                    {3,	UNIT_SIZE*20f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29-10, 29, 20},	//树4
                    //24-16
                    {3,	UNIT_SIZE*16f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*24+10, 24, 16},	//树4
                    {3,	UNIT_SIZE*16f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*24-10, 24, 16},	//树4
                    //23-11
                    {3,	UNIT_SIZE*11f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*23+10, 23, 11},	//树4
                    {3,	UNIT_SIZE*11f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*23-10, 23, 11},	//树4
                    //26-10
                    {3,	UNIT_SIZE*10f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*26+10, 26, 10},	//树4
                    {3,	UNIT_SIZE*10f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*26-10, 26, 10},	//树4
                    //27-9
                    {3,	UNIT_SIZE*9f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*27+10, 27, 9},	//树4
                    {3,	UNIT_SIZE*9f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*27-10, 27, 9},	//树4
                    //28-8
                    {3,	UNIT_SIZE*8f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*28+10, 28, 8},	//树4
                    {3,	UNIT_SIZE*8f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*28-10, 28, 8},	//树4
                    //30-6
                    {3,	UNIT_SIZE*6f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*30+10, 30, 6},	//树4
                    {3,	UNIT_SIZE*6f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*30-10, 30, 6},	//树4
                    //25-2
                    {3,	UNIT_SIZE*2f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*25+10, 25, 2},	//树4
                    {3,	UNIT_SIZE*2f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*25-10, 25, 2},	//树4
                    //23-3
                    {3,	UNIT_SIZE*3f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*23+10, 23, 3},	//树4
                    {3,	UNIT_SIZE*3f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*23-10, 23, 3},	//树4
                    //19-2
                    {3,	UNIT_SIZE*2f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*19+10, 19, 2},	//树4
                    {3,	UNIT_SIZE*2f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*19-10, 19, 2},	//树4
                    //15-2
                    {3,	UNIT_SIZE*2f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*15+10, 15, 2},	//树4
                    {3,	UNIT_SIZE*2f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*15-10, 15, 2},	//树4
                    //13-2
                    {3,	UNIT_SIZE*2f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13+10, 13, 2},	//树4
                    {3,	UNIT_SIZE*2f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13-10, 13, 2},	//树4
                    //8-3
                    {3,	UNIT_SIZE*3f-1, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*8+10, 8, 3},	//树4
                    {3,	UNIT_SIZE*3f+14, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*8-10, 8, 3},	//树4

                    //1-4带半崖子的竖直赛道
                    {2,	UNIT_SIZE*4f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*1-30, 1, 4},	//树4
                    {2,	UNIT_SIZE*4f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*1-30, 1, 4},	//树4
                    {3,	UNIT_SIZE*4f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*1-10, 1, 4},	//树4
                    {3,	UNIT_SIZE*4f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*1-10, 1, 4},	//树4
                    {2,	UNIT_SIZE*4f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*1+10, 1, 4},	//树4
                    {2,	UNIT_SIZE*4f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*1+10, 1, 4},	//树4
                    {3,	UNIT_SIZE*4f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*1+30, 1, 4},	//树4
                    {3,	UNIT_SIZE*4f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*1+30, 1, 4},	//树4

                    {2,	UNIT_SIZE*6f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+UNIT_SIZE/3, 2, 6},	//树4
                    {2,	UNIT_SIZE*6f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+-UNIT_SIZE/3, 2, 6},	//树4
                    {3,	UNIT_SIZE*6f+40, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+UNIT_SIZE/3, 2, 6},	//树4
                    {3,	UNIT_SIZE*6f+40, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+-UNIT_SIZE/3, 2, 6},	//树4

                    {1,	UNIT_SIZE*7f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+UNIT_SIZE/3, 2, 7},	//树4
                    {1,	UNIT_SIZE*7f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+-UNIT_SIZE/3, 2, 7},	//树4

                    {3,	UNIT_SIZE*11f-20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+UNIT_SIZE/3, 2, 11},	//树4
                    {3,	UNIT_SIZE*11f-20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+-UNIT_SIZE/3, 2, 11},	//树4
                    {0,	UNIT_SIZE*11f, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+UNIT_SIZE/3, 2, 11},	//树4
                    {0,	UNIT_SIZE*11f, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+-UNIT_SIZE/3, 2, 11},	//树4
                    {3,	UNIT_SIZE*11f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+UNIT_SIZE/3, 2, 11},	//树4
                    {3,	UNIT_SIZE*11f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+-UNIT_SIZE/3, 2, 11},	//树4
                    {0,	UNIT_SIZE*11f+40, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+UNIT_SIZE/3, 2, 11},	//树4
                    {0,	UNIT_SIZE*11f+40, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+-UNIT_SIZE/3, 2, 11},	//树4

                    {1,	UNIT_SIZE*13f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+UNIT_SIZE/3, 2, 13},	//树4
                    {1,	UNIT_SIZE*13f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+-UNIT_SIZE/3, 2, 13},	//树4
                    {3,	UNIT_SIZE*13f+40, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+UNIT_SIZE/3, 2, 13},	//树4
                    {3,	UNIT_SIZE*13f+40, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*2+-UNIT_SIZE/3, 2, 13},	//树4

                    {3,	UNIT_SIZE*14f, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+UNIT_SIZE/3, 4, 14},	//树4
                    {3,	UNIT_SIZE*14f, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+-UNIT_SIZE/3, 4, 14},	//树4
                    {0,	UNIT_SIZE*14f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+UNIT_SIZE/3, 4, 14},	//树4
                    {0,	UNIT_SIZE*14f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+-UNIT_SIZE/3, 4, 14},	//树4

                    {3,	UNIT_SIZE*12f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+UNIT_SIZE/3, 4, 12},	//树4
                    {3,	UNIT_SIZE*12f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+-UNIT_SIZE/3, 4, 12},	//树4
                    {3,	UNIT_SIZE*12f+40, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+UNIT_SIZE/3, 4, 12},	//树4
                    {3,	UNIT_SIZE*12f+40, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+-UNIT_SIZE/3, 4, 12},	//树4
                    {3,	UNIT_SIZE*12f+60, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+UNIT_SIZE/3, 4, 12},	//树4
                    {3,	UNIT_SIZE*12f+60, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+-UNIT_SIZE/3, 4, 12},	//树4
                    //5-11竖直
                    {3,	UNIT_SIZE*11f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*5+10, 5, 11},	//树4
                    {3,	UNIT_SIZE*11f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*5+10, 5, 11},	//树4
                    {3,	UNIT_SIZE*11f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*5+30, 5, 11},	//树4
                    {3,	UNIT_SIZE*11f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*5+30, 5, 11},	//树4
                    //6-11竖直
                    {3,	UNIT_SIZE*11f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*6+10, 6, 11},	//树4
                    {3,	UNIT_SIZE*11f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*6+10, 6, 11},	//树4
                    {3,	UNIT_SIZE*11f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*6+30, 6, 11},	//树4
                    {3,	UNIT_SIZE*11f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*6+30, 6, 11},	//树4
                    //8-12竖直
                    {3,	UNIT_SIZE*12f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*8+10, 8, 12},	//树4
                    {3,	UNIT_SIZE*12f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*8+10, 8, 12},	//树4
                    {3,	UNIT_SIZE*12f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*8+30, 8, 12},	//树4
                    {3,	UNIT_SIZE*12f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*8+30, 8, 12},	//树4
                    //12-11竖直
                    {3,	UNIT_SIZE*11f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*12+10, 12, 11},	//树4
                    {3,	UNIT_SIZE*11f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*12+10, 12, 11},	//树4
                    {3,	UNIT_SIZE*11f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*12+30, 12, 11},	//树4
                    {3,	UNIT_SIZE*11f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*12+30, 12, 11},	//树4

                    //11-20竖直
                    {3,	UNIT_SIZE*20f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*11+10, 11, 20},	//树4
                    {3,	UNIT_SIZE*20f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*11+10, 11, 20},	//树4
                    {3,	UNIT_SIZE*20f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*11+30, 11, 20},	//树4
                    {3,	UNIT_SIZE*20f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*11+30, 11, 20},	//树4
                    //10-20竖直
                    {3,	UNIT_SIZE*20f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*10+10, 10, 20},	//树4
                    {3,	UNIT_SIZE*20f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*10+10, 10, 20},	//树4
                    {3,	UNIT_SIZE*20f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*10+30, 10, 20},	//树4
                    {3,	UNIT_SIZE*20f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*10+30, 10, 20},	//树4
                    //8-21竖直
                    {3,	UNIT_SIZE*21f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*8+10, 8, 21},	//树4
                    {3,	UNIT_SIZE*21f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*8+10, 8, 21},	//树4
                    {3,	UNIT_SIZE*21f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*8+30, 8, 21},	//树4
                    {3,	UNIT_SIZE*21f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*8+30, 8, 21},	//树4
                    //5-22横
                    {3,	UNIT_SIZE*22f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*5+UNIT_SIZE/3, 5, 22},	//树4
                    {3,	UNIT_SIZE*22f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*5+-UNIT_SIZE/3, 5, 22},	//树4
                    {3,	UNIT_SIZE*22f+40, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*5+UNIT_SIZE/3, 5, 22},	//树4
                    {3,	UNIT_SIZE*22f+40, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*5+-UNIT_SIZE/3, 5, 22},	//树4
                    //5-24横
                    {3,	UNIT_SIZE*24f+10, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*5+UNIT_SIZE/3, 5, 24},	//树4
                    {3,	UNIT_SIZE*24f+10, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*5+-UNIT_SIZE/3, 5, 24},	//树4
                    {3,	UNIT_SIZE*24f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*5+UNIT_SIZE/3, 5, 24},	//树4
                    {3,	UNIT_SIZE*24f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*5+-UNIT_SIZE/3, 5, 24},	//树4
                    //4-25竖直
                    {3,	UNIT_SIZE*25f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+10, 4, 25},	//树4
                    {3,	UNIT_SIZE*25f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+10, 4, 25},	//树4
                    {3,	UNIT_SIZE*25f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+30, 4, 25},	//树4
                    {3,	UNIT_SIZE*25f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+30, 4, 25},	//树4
                    //3-29竖直
                    {3,	UNIT_SIZE*29f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*3+20, 3, 29},	//树4
                    {3,	UNIT_SIZE*29f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*3+20, 3, 29},	//树4
                    {3,	UNIT_SIZE*29f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*3+40, 3, 29},	//树4
                    {3,	UNIT_SIZE*29f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*3+40, 3, 29},	//树4
                    //6-27横
                    {3,	UNIT_SIZE*27f+10, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*6+UNIT_SIZE/3, 6, 27},	//树4
                    {3,	UNIT_SIZE*27f+10, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*6+-UNIT_SIZE/3, 6, 27},	//树4
                    {3,	UNIT_SIZE*27f+30, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*6+UNIT_SIZE/3, 6, 27},	//树4
                    {3,	UNIT_SIZE*27f+30, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*6+-UNIT_SIZE/3, 6, 27},	//树4
                    //9-26竖直
                    {3,	UNIT_SIZE*26f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*9+10, 9, 26},	//树4
                    {3,	UNIT_SIZE*26f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*9+10, 9, 26},	//树4
                    {3,	UNIT_SIZE*26f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*9+30, 9, 26},	//树4
                    {3,	UNIT_SIZE*26f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*9+30, 9, 26},	//树4
                    //13-25竖直
                    {3,	UNIT_SIZE*25f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13+10, 13, 25},	//树4
                    {3,	UNIT_SIZE*25f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13+10, 13, 25},	//树4
                    {3,	UNIT_SIZE*25f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13+30, 13, 25},	//树4
                    {3,	UNIT_SIZE*25f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*13+30, 13, 25},	//树4
                    //14-25竖直
                    {3,	UNIT_SIZE*25f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*14+10, 14, 25},	//树4
                    {3,	UNIT_SIZE*25f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*14+10, 14, 25},	//树4
                    {3,	UNIT_SIZE*25f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*14+30, 14, 25},	//树4
                    {3,	UNIT_SIZE*25f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*14+30, 14, 25},	//树4
                    //16-26竖直
                    {3,	UNIT_SIZE*26f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*16+10, 16, 26},	//树4
                    {3,	UNIT_SIZE*26f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*16+10, 16, 26},	//树4
                    {3,	UNIT_SIZE*26f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*16+30, 16, 26},	//树4
                    {3,	UNIT_SIZE*26f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*16+30, 16, 26},	//树4
                    //18-25竖直
                    {3,	UNIT_SIZE*25f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*18+10, 18, 25},	//树4
                    {3,	UNIT_SIZE*25f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*18+10, 18, 25},	//树4
                    {3,	UNIT_SIZE*25f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*18+20, 18, 25},	//树4
                    {3,	UNIT_SIZE*25f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*18+20, 18, 25},	//树4
                    //24-24竖直
                    {3,	UNIT_SIZE*24f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*24+10, 24, 24},	//树4
                    {3,	UNIT_SIZE*24f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*24+10, 24, 24},	//树4
                    {3,	UNIT_SIZE*24f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*24+30, 24, 24},	//树4
                    {3,	UNIT_SIZE*24f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*24+30, 24, 24},	//树4
                    //27-24竖直
                    {3,	UNIT_SIZE*24f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*27+10, 27, 24},	//树4
                    {3,	UNIT_SIZE*24f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*27+10, 27, 24},	//树4
                    {3,	UNIT_SIZE*24f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*27+30, 27, 24},	//树4
                    {3,	UNIT_SIZE*24f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*27+30, 27, 24},	//树4
                    //28-24竖直
                    {3,	UNIT_SIZE*24f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*28+10, 28, 24},	//树4
                    {3,	UNIT_SIZE*24f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*28+10, 28, 24},	//树4
                    {3,	UNIT_SIZE*24f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*28+30, 28, 24},	//树4
                    {3,	UNIT_SIZE*24f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*28+30, 28, 24},	//树4
                    //26-15竖直
                    {3,	UNIT_SIZE*15f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*26+10, 26, 15},	//树4
                    {3,	UNIT_SIZE*15f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*26+10, 26, 15},	//树4
                    {3,	UNIT_SIZE*15f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*26+30, 26, 15},	//树4
                    {3,	UNIT_SIZE*15f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*26+30, 26, 15},	//树4
                    //25-15竖直
                    {3,	UNIT_SIZE*15f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*25+10, 25, 15},	//树4
                    {3,	UNIT_SIZE*15f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*25+10, 25, 15},	//树4
                    {3,	UNIT_SIZE*15f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*25+30, 25, 15},	//树4
                    {3,	UNIT_SIZE*15f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*25+30, 25, 15},	//树4
                    //23-16竖直
                    {3,	UNIT_SIZE*16f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*23+10, 23, 16},	//树4
                    {3,	UNIT_SIZE*16f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*23+10, 23, 16},	//树4
                    {3,	UNIT_SIZE*16f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*23+30, 23, 16},	//树4
                    {3,	UNIT_SIZE*16f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*23+30, 23, 16},	//树4
                    //20-13横
                    {3,	UNIT_SIZE*13f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*20+UNIT_SIZE/3, 20, 13},	//树4
                    {3,	UNIT_SIZE*13f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*20+-UNIT_SIZE/3, 20, 13},	//树4
                    {3,	UNIT_SIZE*13f+40, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*20+UNIT_SIZE/3, 20, 13},	//树4
                    {3,	UNIT_SIZE*13f+40, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*20+-UNIT_SIZE/3, 20, 13},	//树4
                    //20-14横
                    {3,	UNIT_SIZE*14f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*20+UNIT_SIZE/3, 20, 14},	//树4
                    {3,	UNIT_SIZE*14f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*20+-UNIT_SIZE/3, 20, 14},	//树4
                    {3,	UNIT_SIZE*14f+40, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*20+UNIT_SIZE/3, 20, 14},	//树4
                    {3,	UNIT_SIZE*14f+40, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*20+-UNIT_SIZE/3, 20, 14},	//树4
                    //21-11竖直
                    {3,	UNIT_SIZE*11f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*21+10, 21, 11},	//树4
                    {3,	UNIT_SIZE*11f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*21+10, 21, 11},	//树4
                    {3,	UNIT_SIZE*11f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*21+30, 21, 11},	//树4
                    {3,	UNIT_SIZE*11f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*21+30, 21, 11},	//树4
                    //22-11竖直
                    {3,	UNIT_SIZE*11f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*22+10, 22, 11},	//树4
                    {3,	UNIT_SIZE*11f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*22+10, 22, 11},	//树4
                    {3,	UNIT_SIZE*11f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*22+30, 22, 11},	//树4
                    {3,	UNIT_SIZE*11f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*22+30, 22, 11},	//树4
                    //24-10竖直
                    {3,	UNIT_SIZE*10f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*24+10, 24, 10},	//树4
                    {3,	UNIT_SIZE*10f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*24+10, 24, 10},	//树4
                    {3,	UNIT_SIZE*10f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*24+30, 24, 10},	//树4
                    {3,	UNIT_SIZE*10f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*24+30, 24, 10},	//树4
                    //25-10竖直
                    {3,	UNIT_SIZE*10f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*25+10, 25, 10},	//树4
                    {3,	UNIT_SIZE*10f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*25+10, 25, 10},	//树4
                    {3,	UNIT_SIZE*10f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*25+30, 25, 10},	//树4
                    {3,	UNIT_SIZE*10f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*25+30, 25, 10},	//树4
                    //29-3横
                    {3,	UNIT_SIZE*3f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29+UNIT_SIZE/3, 29, 3},	//树4
                    {3,	UNIT_SIZE*3f+20, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29+-UNIT_SIZE/3, 29, 3},	//树4
                    {3,	UNIT_SIZE*3f+40, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29+UNIT_SIZE/3, 29, 3},	//树4
                    {3,	UNIT_SIZE*3f+40, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29+-UNIT_SIZE/3, 29, 3},	//树4
                    {3,	UNIT_SIZE*3f+60, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29+UNIT_SIZE/3, 29, 3},	//树4
                    {3,	UNIT_SIZE*3f+60, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29+-UNIT_SIZE/3, 29, 3},	//树4
                    //29-4横
                    {3,	UNIT_SIZE*4f+10, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29+UNIT_SIZE/3, 29, 4},	//树4
                    {3,	UNIT_SIZE*4f+10, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29+-UNIT_SIZE/3, 29, 4},	//树4
                    {3,	UNIT_SIZE*4f+30, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29+UNIT_SIZE/3, 29, 4},	//树4
                    {3,	UNIT_SIZE*4f+30, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*29+-UNIT_SIZE/3, 29, 4},	//树4
                    //27-2竖直
                    {3,	UNIT_SIZE*2f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*27+10, 27, 2},	//树4
                    {3,	UNIT_SIZE*2f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*27+10, 27, 2},	//树4
                    {3,	UNIT_SIZE*2f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*27+30, 27, 2},	//树4
                    {3,	UNIT_SIZE*2f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*27+30, 27, 2},	//树4
                    //24-2竖直
                    {3,	UNIT_SIZE*2f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*24+10, 24, 2},	//树4
                    {3,	UNIT_SIZE*2f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*24+10, 24, 2},	//树4
                    {3,	UNIT_SIZE*2f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*24+30, 24, 2},	//树4
                    {3,	UNIT_SIZE*2f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*24+30, 24, 2},	//树4
                    //20-1竖直
                    {3,	UNIT_SIZE*1f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*20+10, 20, 1},	//树4
                    {3,	UNIT_SIZE*1f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*20+10, 20, 1},	//树4
                    {3,	UNIT_SIZE*1f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*20+30, 20, 1},	//树4
                    {3,	UNIT_SIZE*1f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*20+30, 20, 1},	//树4
                    //17-1竖直
                    {3,	UNIT_SIZE*1f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*17+10, 17, 1},	//树4
                    {3,	UNIT_SIZE*1f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*17+10, 17, 1},	//树4
                    {3,	UNIT_SIZE*1f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*17+30, 17, 1},	//树4
                    {3,	UNIT_SIZE*1f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*17+30, 17, 1},	//树4
                    //16-1竖直
                    {3,	UNIT_SIZE*1f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*16+10, 16, 1},	//树4
                    {3,	UNIT_SIZE*1f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*16+10, 16, 1},	//树4
                    {3,	UNIT_SIZE*1f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*16+30, 16, 1},	//树4
                    {3,	UNIT_SIZE*1f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*16+30, 16, 1},	//树4
                    //12-2竖直
                    {3,	UNIT_SIZE*2f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*12+10, 12, 2},	//树4
                    {3,	UNIT_SIZE*2f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*12+10, 12, 2},	//树4
                    {3,	UNIT_SIZE*2f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*12+30, 12, 2},	//树4
                    {3,	UNIT_SIZE*2f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*12+30, 12, 2},	//树4
                    //11-2竖直
                    {3,	UNIT_SIZE*2f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*11+10, 11, 2},	//树4
                    {3,	UNIT_SIZE*2f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*11+10, 11, 2},	//树4
                    {3,	UNIT_SIZE*2f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*11+30, 11, 2},	//树4
                    {3,	UNIT_SIZE*2f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*11+30, 11, 2},	//树4
                    //6-2竖直
                    {3,	UNIT_SIZE*2f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*6+10, 6, 2},	//树4
                    {3,	UNIT_SIZE*2f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*6+10, 6, 2},	//树4
                    {3,	UNIT_SIZE*2f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*6+30, 6, 2},	//树4
                    {3,	UNIT_SIZE*2f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*6+30, 6, 2},	//树4
                    //4-2竖直
                    {3,	UNIT_SIZE*2f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+10, 4, 2},	//树4
                    {3,	UNIT_SIZE*2f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+10, 4, 2},	//树4
                    {3,	UNIT_SIZE*2f+17, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+30, 4, 2},	//树4
                    {3,	UNIT_SIZE*2f-22, WATER_HIGH_ADJUST+1.5f, UNIT_SIZE*4+30, 4, 2},	//树4
            };
}