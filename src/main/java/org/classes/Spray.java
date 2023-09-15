package org.classes;

public class Spray extends Drug{

    private int volume_;

    public String getName() { return name_; }
    public String getManufacturer() { return manufacturer_; }
    public float getCost() { return cost_; }

    public Spray(){
        name_ = "Untitled";
        manufacturer_ = "None";
        price_  = 0;
        vat_    = 0;
        volume_ = 0;
    }

    public Spray(String name, String manufacturer, float price, float vat, int volume){
        name_ = name;
        manufacturer_ = manufacturer;
        price_ = price;
        vat_   = vat;
        volume_ = volume;
    }

    public Spray(Spray obj){
        name_ = obj.name_;
        manufacturer_ = obj.manufacturer_;
        price_  = obj.price_;
        vat_    = obj.vat_;
        volume_ = obj.volume_;
    }

    @Override
    public float countPrice(){
        return price_ *= vat_;  //цена с ндс
    }

    @Override
    public int getExtra() { return volume_; }

    @Override
    public String toString(){
        String str;
        str = "Спрей " + name_ + ", " + volume_ + "мг, " + manufacturer_
                + "......................." + price_ + "BYN\n";
        return str;
    }


    public boolean equals(Spray obj)
    {
        if(obj == this) { return true; }

        if(obj == null) { return false; }

        if(!(getClass() == obj.getClass())) { return false; }
        else{
            return ((Spray)obj).name_.equals(this.name_);
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
