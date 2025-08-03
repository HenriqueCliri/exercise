public class Staff {
    private String name;
    private Staff supervisor;

    public Staff(String name) { // constructor
        this.name = name;
    }

    public void setSupervisor(Staff supervisor) {
        this.supervisor = supervisor;
    }

    public String getSupervisor() { // Getter name of supervisor
        if (supervisor != null) {
            return supervisor.name;
        } else {
            return "Without supervisor";
        }
    }

    public static void main(String[] args) {
        Staff jhon = new Staff("John");
        Staff maria = new Staff("Maria");

        jhon.setSupervisor(maria);

        System.out.println(jhon.getSupervisor());
        System.out.println(maria.getSupervisor());
    }
}