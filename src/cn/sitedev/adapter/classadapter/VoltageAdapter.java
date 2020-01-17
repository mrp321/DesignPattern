package cn.sitedev.adapter.classadapter;

// 适配器类
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        // 获取到220V电压
        int srcV = this.output220V();
        int dstV = srcV / 44; // 转成5V
        return dstV;
    }

}
