package cn.sitedev.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepPrototype implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    public String name; // String类型
    public DeepCloneableTarget deepCloneableTarget; // 引用类型

    public DeepPrototype() {
        super();
    }

    // 深拷贝-方式1 使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 这里完成对基本数据类型(属性)和String的克隆
        deep = super.clone();
        // 对引用类型的属性, 进行单独处理
        DeepPrototype deepPrototype = (DeepPrototype)deep;
        deepPrototype.deepCloneableTarget = (DeepCloneableTarget)this.deepCloneableTarget.clone();
        return deepPrototype;
    }

    // 深拷贝-方式2 通过对象的序列化实现(推荐)
    public Object deepClone() {
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 当前这个对象以对象流的方式输出
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype copyObj = (DeepPrototype)ois.readObject();
            return copyObj;
        } catch (Exception e) {
            return null;
        } finally {
            // 关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
