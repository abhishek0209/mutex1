package Human;

abstract class Human {
    private String name;
    private int id;

    public Human() {
    }


    public  Human(int id, String name)
        {
            this.name=name;
            this.id=id;
        }


    public int getid(){
            return id;
        }

    public abstract String getName();
}


