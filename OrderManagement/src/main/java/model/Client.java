package model;

/**
 * @Author: Fetcu Marcos Dimitris
 * TP Assignment3
 * @Since: May 18, 2023
 */
public class Client
{
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;

    /**
     * This is the constructor for a client. This class only has setters and getters
     * @param id
     * @param name
     * @param email
     * @param phoneNumber
     * @param adress
     */

    public Client(int id, String name, String email, String phoneNumber, String adress)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = adress;
    }
    public Client()
    {
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client [id=" + id + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address
                + "]";
    }
}


