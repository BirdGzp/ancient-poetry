package com.moon.ancientpoetry.common.enums;

/**
 * 朝代表
 */
public enum Dynasty{

    PRE_QIN_DYNASTY(1,"PRE_QIN_DYNASTY", "先秦"),
    WESTERN_AND_EASTER_HAN_DYNASTY(2, " WESTERN_AND_EASTER_HAN_DYNASTY", "两汉"),
    WEI_JIN_DYNASTY(3, "WEI_JIN_DYNASTY", "魏晋"),
    SOURTH_AND_NOTRH_DYNASTY(4, "SOURTH_AND_NOTRH_DYNASTY", "南北朝"),
    SUI_DYNASTY(5, "SUI_DYNASTY", "隋代"),
    TANG_DYNASTY(6, "TANG_DYNASTY", "唐代"),
    FIVE_DYNASTY(7, "FIVE_DYNASTY", "五代"),
    SONG_DYNASTY(8, "SONG_DYNASTY", "宋代"),
    JIN_DANASTY(9, "JIN_DANASTY", "金朝"),
    YUAN_DYNASTY(10, "YUAN_DYNASTY", "元代"),
    MING_DYNASTY(11, "MING_DYNASTY", "明代"),
    QING_DYNASTY(12, "QING_DYNASTY", "清代");

    private Integer DynastyId;
    private String DynastyEn;
    private String DynastyZh;

    private Dynasty(Integer DynastyId, String DynastyEn,  String DynastyZh){
        this.DynastyId = DynastyId;
        this.DynastyEn = DynastyEn;
        this.DynastyZh = DynastyZh;
    }

    public Integer getDynastyId() {
        return DynastyId;
    }

    public void setDynastyId(Integer DynastyId) {
        this.DynastyId = DynastyId;
    }

    public String getDynastyEn() {
        return DynastyEn;
    }

    public void setDynastyEn(String DynastyEn) {
        this.DynastyEn = DynastyEn;
    }

    public String getDynastyZh() {
        return DynastyZh;
    }

    public void setDynastyZh(String DynastyZh) {
        this.DynastyZh = DynastyZh;
    }
    
    public static Integer getDynasty(String dynastyZh){
        switch (dynastyZh){
            case "先秦":
                return Dynasty.PRE_QIN_DYNASTY.DynastyId;
            case "两汉":
                return Dynasty.WESTERN_AND_EASTER_HAN_DYNASTY.DynastyId;
            case "魏晋":
                return Dynasty.WEI_JIN_DYNASTY.DynastyId;
            case "南北朝":
                return Dynasty.SOURTH_AND_NOTRH_DYNASTY.DynastyId;
            case "隋代":
                return Dynasty.SUI_DYNASTY.DynastyId;
            case "唐代":
                return Dynasty.TANG_DYNASTY.DynastyId;
            case "五代":
                return Dynasty.FIVE_DYNASTY.DynastyId;
            case "宋代":
                return Dynasty.SONG_DYNASTY.DynastyId;
            case "金朝":
                return Dynasty.JIN_DANASTY.DynastyId;
            case "元代":
                return Dynasty.YUAN_DYNASTY.DynastyId;
            case "明代":
                return Dynasty.MING_DYNASTY.DynastyId;
            case "清代":
                return Dynasty.QING_DYNASTY.DynastyId;
            default:
                return 0;

        }
    }

    public static void main(String[] args) {
        System.out.println(Dynasty.getDynasty("元代"));
    }
}
