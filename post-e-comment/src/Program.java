import comments.Comment;
import post.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {
    public static void main(String [] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


        Comment c1 = new Comment("Lugar lindo");
        Comment c2 = new Comment("Que maravilhoso");

        Post p1 = new Post(sdf.parse("20/08/2026 14:42:20"), "Passeando", "viagem", 12 );


        p1.addComments(c1);
        p1.addComments(c2);

        System.out.println(p1);



















        /*System.out.println("Quantos posts você deseja fazer: ");
        int quantidade_de_posts = sc.nextInt();
        for(int i = 0; i < quantidade_de_posts; i++){
            System.out.println("Digite o dia da postagem: ");
            //int data?
            System.out.println("Digite o título da postagem: ");
            //String titulo = sc.nextLine();
            System.out.println("Digite o conteúdo da postagem: ");
            //String conteudo = sc.nextLine();
            System.out.println("Digite a quantidade de likes da postagem: ");
            //int likes = sc.nextInt();
            System.out.println("Deseja fazer algum comentário na postagem? y/n");
            String resposta = sc.nextLine();
            if(resposta.equals("y")){
                System.out.println("Quantos Comentários deseja fazer: ");
                int quantidade_de_comentarios = sc.nextInt();
                for(int j = 0; j < quantidade_de_comentarios; j++){
                    System.out.printf("Comentário %d: %n", j+1);
                    //faço a variavel do tipo objeto de comment?


                }


            }

        }*/









    }

}
