using System;
using System.Windows.Forms;
using MySql.Data.MySqlClient;

namespace _253MC
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label6_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void groupBox1_Enter(object sender, EventArgs e)
        {

        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            
        }

        private void button3_Click(object sender, EventArgs e)
        {
            using (MySqlConnection conexao = new MySqlConnection("Server=localhost;Port=3306;Database=banco;User=root;Password="))
            {
                conexao.Open();
                using (MySqlCommand cmd = conexao.CreateCommand())
                {
                    cmd.CommandText = "INSERT INTO clientes (nome, documento, genero, rg, estadocivil, datanascimento, cep, endereco, numero, bairro,cidade, estado, celular, email, obs, situacao) VALUES(@nome, @documento, @genero, @rg, @estadocivil, @datanascimento,@cep, @endereco, @numero, @bairro,@cidade, @estado, @celular, @email, @obs, @situacao)";
                    cmd.Parameters.AddWithValue("@nome", txtNome.Text);
                    cmd.Parameters.AddWithValue("@documento", txtdocumento.Text);
                    cmd.Parameters.AddWithValue("@genero", "genero");
                    cmd.Parameters.AddWithValue("@rg", txtrg.Text);
                    cmd.Parameters.AddWithValue("@estadocivil", cbestcivil.Text);
                    cmd.Parameters.AddWithValue("@datanascimento", txtnasc.Text);
                    cmd.Parameters.AddWithValue("@cep", txtcep.Text);
                    cmd.Parameters.AddWithValue("@endereco", cbendereco.Text);
                    cmd.Parameters.AddWithValue("@numero", txtnumero.Text);
                    cmd.Parameters.AddWithValue("@bairro", cbbairro.Text);
                    cmd.Parameters.AddWithValue("@cidade", cbcidade.Text);
                    cmd.Parameters.AddWithValue("@estado", cbestado.Text);
                    cmd.Parameters.AddWithValue("@celular", txtcelular.Text);
                    cmd.Parameters.AddWithValue("@email", txtemail.Text);
                    cmd.Parameters.AddWithValue("@obs", txtobs.Text);
                    cmd.Parameters.AddWithValue("@situacao", cbSituacao.Text);


                    cmd.ExecuteNonQuery();
                }
                MessageBox.Show("Cadastro Realizado com Sucesso!");
            }
        }
    }
}
