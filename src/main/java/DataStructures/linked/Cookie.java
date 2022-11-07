package DataStructures.linked;

public class Cookie {
    private String color;

    public Cookie(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }


    public static void main(String[] args) {
        Cookie cookie1= new Cookie("green");
    }
}


