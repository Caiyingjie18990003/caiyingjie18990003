package com.example.work7.bean;

import com.example.work7.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "款式1", "款式2", "款式3", "款式4", "款式5", "款式6","款式7","款式8"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "款式1 ：实力，来的轻巧",
            "款式2 ：一步到位",
            "款式3 ：自我再飞跃",
            "款式4 ：中华有为",
            "款式5 ：平添实力",
            "款式6：升为大提速",
            "款式7：凭实力出彩",
            "款式8：一Pro到位"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {7129,7999, 7989, 15499, 16899, 17599,1521,4899};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.k1, R.drawable.k2, R.drawable.k3,
            R.drawable.k4, R.drawable.k5, R.drawable.k6,R.drawable.k7,R.drawable.k8
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.k1, R.drawable.k2, R.drawable.k3,
            R.drawable.k4, R.drawable.k5, R.drawable.k6,R.drawable.k7,R.drawable.k8
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
