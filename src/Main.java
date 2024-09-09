import EMPREGADO.Empregado;
import EMPREGADO.Empresa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Esfera esfera = new Esfera(5);
//        System.out.printf("Raio: %.2f cm%n", esfera.getRaio());
//        System.out.printf("Área: %.2f cm²%n", esfera.calcularArea());
//        System.out.printf("Volume: %.2f cm³%n", esfera.calcularVolume());

        Scanner scanner = new Scanner(System.in);

        Empregado empregado = new Empregado();
        System.out.println("Informe o nome do empregado:");
        empregado.setNome(scanner.nextLine());
        System.out.println("Informe o salário do empregado:");
        empregado.setSalario(scanner.nextDouble());
        scanner.nextLine();

        Empresa empresa = new Empresa();
        System.out.println("Informe a razão social da empresa:");
        empresa.setRazaoSocial(scanner.nextLine());

        System.out.println("Informe o CNPJ da empresa:");
        empresa.setCNPJ(scanner.nextLine());

        System.out.println("Informe o telefone da empresa:");
        empresa.setFone(scanner.nextLine());

        empregado.setEmpresa(empresa);

        System.out.println("Dados do empregado");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Salário: " + empregado.getSalario());

        Empresa emp = empregado.getEmpresa();
        System.out.println("Dados Empresariais");
        System.out.println("Razão Social: " + emp.getRazaoSocial());
        System.out.println("CNPJ: " + emp.getCNPJ());
        System.out.println("Telefone: " + emp.getFone());
        scanner.close();
    }
}