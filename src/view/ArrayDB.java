package view;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayDB {

    public static void add(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Scanner teclado = new Scanner(System.in);


    private String chave;

    protected static List<ArrayDB> listaServico = new ArrayList<ArrayDB>();

    public ArrayDB(String chave) {
        this.chave = chave;
    }

    public void cadastraChave(String chave) {
        listaServico.add(new ArrayDB(chave));
    }

    public void consultaServico() {

        for(ArrayDB item : listaServico)
            System.out.println(item);
    }

    public void editarServico() {

        ArrayDB aux = null;
        String chave = "";
        boolean fim = false;

        do {
        System.out.print("Informe o chave do Serviço que deseja editar: ");
        chave = teclado.next();

        for(ArrayDB item : listaServico)
            if(item.chave == chave) {
                aux = item;

                System.out.println(item + "\n");
                System.out.println("Edição: ");
                System.out.print("Novo Nome: ");
                String novoNome = teclado.next();

                System.out.print("Nova Descrição: ");

                item = new ArrayDB(novoNome);
                System.out.println("Alterações feitas!");
                fim = true;
            }
        }while(fim == false);
    }

    public void excluirServico() {

        ArrayDB aux = null;
        String chave = "";
        boolean fim = false;

        do {
        System.out.print("Informe o chave que deseja Deletar: ");
        chave = teclado.next();

        for(ArrayDB item : listaServico)
            if(item.chave == chave) {
                aux = item;

                System.out.println(item + "\n");

                listaServico.remove(item);
                System.out.println("Chave deletada");
                fim = true;
            }
            else
                System.out.println("Não encontramos nenhum registro com essa chave");
        }while(fim == false);
    }


    @Override
    public String toString() {

        String s = "------------------------\n"
                + "Registrado: " + chave;
        return s;
    }
}