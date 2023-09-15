package org.classes;

public class Pill extends Drug{

    private int doze_;

    public String getName() { return name_; }
    public String getManufacturer() { return manufacturer_; }
    public float getCost() { return cost_; }

    public Pill(){
        name_ = "Untitled";
        manufacturer_ = "None";
        price_  = 0;
        vat_    = 0;
        doze_ = 0;
    }

    public Pill(String name, String manufacturer, float price, float vat, int doze){
        name_ = name;
        manufacturer_ = manufacturer;
        price_ = price;
        vat_   = vat;
        doze_ = doze;
    }

    public Pill(Pill obj){
        name_ = obj.name_;
        manufacturer_ = obj.manufacturer_;
        price_  = obj.price_;
        vat_    = obj.vat_;
        doze_ = obj.doze_;
    }

    @Override
    public float countPrice(){
        return price_ *= vat_;  //цена с ндс
    }

    @Override
    public int getExtra() { return doze_; }

    @Override
    public String toString(){
        String str;
        str = "Таблетки " + name_ + ", " + doze_ + "мг, " + manufacturer_
                + "......................." + price_ + "BYN\n";
        return str;
    }


    public boolean equals(Pill obj)
    {
        if(obj == this) { return true; }

        if(obj == null) { return false; }

        if(!(getClass() == obj.getClass())) { return false; }
        else{
            return ((Pill)obj).name_.equals(this.name_);
        }
    }

    @Override
    public int hashCode() {
        int total = 31;

        total = total * 31 + name_.hashCode();
        total = total * 31 + manufacturer_.hashCode();
        total = total * 31 + doze_;
        total = total * 31 + Float.floatToIntBits(cost_);
        total = total * 31 + Float.floatToIntBits(vat_);
        total = total * 31 + Float.floatToIntBits(price_);

        return total;
    }

}
