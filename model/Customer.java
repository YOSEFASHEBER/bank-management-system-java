package model;

public class Customer {

    private final int id;
    private  String name;
    private  String phone;

    public Customer(int id, String name, String phone){
        this.id= id;
        this.name = name;
        this.phone = phone;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getPhone(){
        return this.phone;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    @Override
    public String toString(){
        return "Customer{" +
                "id=" + this.id +
                ", name='" + this.name + '\''+
                ",phone='" + this.phone + '\''+
                '}';
    }
}
