package org.classes;

public class Cream extends Drug{

    private int volume_;

    public Cream(){
        name_ = "Untitled";
        manufacturer_ = "None";
        price_  = countPrice();
        vat_    = 0;
        cost_   = 0;
        volume_ = 0;
    }

    public Cream(String name, String manufacturer, float price, float vat, int volume){
        name_ = name;
        manufacturer_ = manufacturer;
        price_  = price;
        vat_    = vat;
        volume_ = volume;
    }

    public Cream(Cream obj){
        name_ = obj.name_;
        manufacturer_ = obj.manufacturer_;
        price_  = obj.price_;
        cost_   = obj.cost_;
        vat_    = obj.vat_;
        volume_ = obj.volume_;
    }

    @Override
    public float countPrice(){
        return cost_ += vat_ * cost_;  //цена с ндс
    }

    @Override
    public int getExtra() { return volume_; }

    @Override
    public String toString(){
        String str;
        str = "Мазь " + name_ + ", " + volume_ + "мл, " + manufacturer_
                + "......................." + price_ + "BYN\n";
        return str;
    }


    public boolean equals(Cream obj)
    {
        if(obj == this) { return true; }

        if(obj == null) { return false; }

        if(!(getClass() == obj.getClass())) { return false; }
        else{
            return ((Cream)obj).name_.equals(this.name_);
        }
    }

    @Override
    public int hashCode() {
        int total = 31;

        total = total * 31 + name_.hashCode();
        total = total * 31 + manufacturer_.hashCode();
        total = total * 31 + volume_;
        total = total * 31 + Float.floatToIntBits(cost_);
        total = total * 31 + Float.floatToIntBits(vat_);
        total = total * 31 + Float.floatToIntBits(price_);

        return total;
    }

}
