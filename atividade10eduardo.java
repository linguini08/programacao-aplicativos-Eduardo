import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {
    private int id;
    private String nome;

    public Aluno() {}

    public Aluno(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class ConexaoDAO {
    
    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/escola";
        String user = "root";
        String password = "senha";
        return DriverManager.getConnection(url, user, password);
    }

    public void cadastrarAluno(Aluno aluno) {
        String sql = "INSERT INTO alunos (id, nome) VALUES (?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, aluno.getId());
            stmt.setString(2, aluno.getNome());
            stmt.executeUpdate();
            System.out.println("Aluno cadastrado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Aluno> listarAlunos() {
        List<Aluno> lista = new ArrayList<>();
        String sql = "SELECT * FROM alunos";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Aluno a = new Aluno(rs.getInt("id"), rs.getString("nome"));
                lista.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void atualizarAluno(Aluno aluno) {
        String sql = "UPDATE alunos SET nome = ? WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getId());
            stmt.executeUpdate();
            System.out.println("Aluno atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarAluno(int id) {
        String sql = "DELETE FROM alunos WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Aluno deletado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConexaoDAO dao = new ConexaoDAO();

        while (true) {
            System.out.println("\n--- Sistema de Alunos ---");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Deletar");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    dao.cadastrarAluno(new Aluno(id, nome));
                    break;

                case 2:
                    List<Aluno> alunos = dao.listarAlunos();
                    for (Aluno a : alunos) {
                        System.out.println(a.getId() + " - " + a.getNome());
                    }
                    break;

                case 3:
                    System.out.print("ID do aluno a atualizar: ");
                    int idUp = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Novo nome: ");
                    String nomeUp = sc.nextLine();
                    dao.atualizarAluno(new Aluno(idUp, nomeUp));
                    break;

                case 4:
                    System.out.print("ID do aluno a deletar: ");
                    int idDel = sc.nextInt();
                    dao.deletarAluno(idDel);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
