using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Diagnostics.Eventing.Reader;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace formulario
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            comboBox2.Text = string.Empty;

            if (comboBox1.Text == "Fiat") 
            {
                pictureBox2.ImageLocation = @"C:\Users\aluno\Downloads\2-53\marcas\" + comboBox1.Text + ".jpg";
                pictureBox2.SizeMode = PictureBoxSizeMode.StretchImage;
                comboBox2.Items.Clear();
                comboBox2.Items.Add("Fiat_Cronos");
                comboBox2.Items.Add("Fiat_Titano");
            }
            else if (comboBox1.Text == "Abarth")
            {
                pictureBox2.ImageLocation = @"C:\Users\aluno\Downloads\2-53\marcas\" + comboBox1.Text + ".jpg";
                pictureBox2.SizeMode = PictureBoxSizeMode.StretchImage;
                comboBox2.Items.Clear();
                comboBox2.Items.Add("Abarth_Fastback");
                comboBox2.Items.Add("Abarth_Pulse");
            }
            else if (comboBox1.Text == "Jeep")
            {
                pictureBox2.ImageLocation = @"C:\Users\aluno\Downloads\2-53\marcas\" + comboBox1.Text + ".jpg";
                pictureBox2.SizeMode = PictureBoxSizeMode.StretchImage;
                comboBox2.Items.Clear();
                comboBox2.Items.Add("Jeep_Compass");
                comboBox2.Items.Add("Jeep_Renegade");
            }
            else if (comboBox1.Text == "Ram")
            {
                pictureBox2.ImageLocation = @"C:\Users\aluno\Downloads\2-53\marcas\" + comboBox1.Text + ".jpg";
                pictureBox2.SizeMode = PictureBoxSizeMode.StretchImage;
                comboBox2.Items.Clear();
                comboBox2.Items.Add("Ram_1500");
                comboBox2.Items.Add("Ram_Rampage");
            }

        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {

        }

        private void comboBox2_SelectedIndexChanged_1(object sender, EventArgs e)
        {
            string[] carro = Directory.GetFiles(@"C:\Users\aluno\Downloads\2-53\carros");
            foreach (string imagens in carro)
            {
                string[] separador = imagens.Split('\\');
                string[] fotos = separador[6].Split('.');

                if (comboBox2.Text == fotos[0])
                {
                    pictureBox2.ImageLocation = @"C:\Users\aluno\Downloads\2-53\carros\" + comboBox2.Text + ".jpg";
                    pictureBox2.SizeMode = PictureBoxSizeMode.StretchImage;
                }

            }
        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }
    }
}
