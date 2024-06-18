package Etapa3;

public class C13EX11_class {
    public static double CalculaIRPF(double salario, double quantidade_dependentes){
        double salario_calculado, aliquota;

        salario_calculado = salario - (quantidade_dependentes * 150);

        if (salario_calculado <= 1000){
            aliquota = 0;
        } else if (salario_calculado <= 5000) {
            aliquota = salario_calculado * 0.1;
        } else if (salario_calculado <= 10000) {
            aliquota = salario_calculado * 0.15;
        } else {
            aliquota = salario_calculado * 0.2;
        }

        return aliquota;
    }
}
