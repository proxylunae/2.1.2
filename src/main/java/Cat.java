public class Cat {
    private String name;
    public Cat(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void meow() {
        System.out.printf("%s говорит \"Мяу!\"\n", name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
