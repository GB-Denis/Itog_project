

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Notebook {
    String id;
    int oZU;
    int hardDisc;
    String oS;
    String color;
    String model;

    public Notebook(String id, int oZU, int hardDisc, String oS, String color, String model)
    {
        this.id = id;
        this.oZU = oZU;
        this.oS = oS;
        this.hardDisc = hardDisc;
        this.color = color;
        this.model = model;
    }

    public static List<String> propertiesForFilter()
    {
        List<String> list = new ArrayList<>();
        list.add("oZU");
        list.add("hardDisc");
        list.add("oS");
        list.add("color");
        list.add("model");
        return list;
    }

    @Override
    public String toString()
    {
        return "Ноутбук: (" + id + "): " +
                "Оперативная память: " + oZU +
                ", Объем Жесткого диска: " + hardDisc +
                ", Система: " + oS +
                ", Цвет: " + color +
                ", Модель: " + model;
    }


    public String getId()
    {
        return id;
    }

    public void setId(String name)
    {
        this.id = name;
    }


    public int getOZU()
    {
        return oZU;
    }

    public void setOZU(int oZU)
    {
        this.oZU = oZU;
    }

    public int getHardDisc()
    {
        return hardDisc;
    }

    public void setHardDisc(int hdd)
    {
        this.hardDisc = hdd;
    }


    public String getOS()
    {
        return oS;
    }

    public void setOS(String oS)
    {
        this.oS = oS;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(int hdd)
    {
        this.color = color;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }







}
