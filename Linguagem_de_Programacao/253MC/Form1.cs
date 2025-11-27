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
            using (MySqlConnection conn = new MySqlConnection("Server=localhost;Port=3306;Database=cliente253;User=root;Password="))
            {
                conn.Open();
                using (MySqlCommand cmd = conn.CreateCommand())
                {
                    cmd.CommandText = "INSERT INTO clientes (nome, documento, genero, rg, estado civil, datanascimento,cep, endereco, numero, bairro,cidade, estado, celular, email, obs, situacao)" "VALUES= clientes (nome, documento, genero, rg, estado civil, datanascimento,cep, endereco, numero, bairro,cidade, estado, celular, email, obs, situacao)")
                    cmd.Parameters.AddWithValue("@nome", txtNome.Text);
                    cmd.Parameters.AddWithValue("@documento", txtDocumento.Text);
                    cmd.Parameters.AddWithValue("@genero", "genero");
                    cmd.Parameters.AddWithValue("@rg", textRg.Text);
                    cmd.Parameters.AddWithValue("@estadocivil", CbEstadoCivil.Text);
                }
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {

        }
    }
}
