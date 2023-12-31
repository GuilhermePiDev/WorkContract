package entites;

import entites.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private Departament departament;
    // lista não vai no construdor, e a lista começa vazia
    private List<HourContract> contracts = new ArrayList<>();
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    Worker(){}

    public Worker(String name, WorkerLevel level, double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }
    //Retorna o salario base + os valores de contrato

    public Double income(int year, int mouth){
        //calendario
        double soma = baseSalary;
        Calendar calendar = Calendar.getInstance();

        for (HourContract contract : contracts){
            calendar.setTime(contract.getDate());
            int contractYear = calendar.get(Calendar.YEAR);
            int contractMouth = calendar.get(Calendar.MONTH);
        }

        return null;
    }
}
