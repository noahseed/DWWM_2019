using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _02_additionneur
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void button_Click(object sender, EventArgs e)
        {
            if(sender is Button btn)
            {
                int S = Convert.ToInt32(btn.Text);

                textResult.AppendText(nb.ToString() + " + ");
            }
        }

        private void buttonVider_Click(object sender, EventArgs e)
        {
            textResult.Clear();
        }

        private void buttonCalculer_Click(object sender, EventArgs e)
        {
            if (sender is Button btn)
            {
               // int result = Convert.ToInt32(btn.Text);

                textResult.Text = (" + ");
            }
        }
    }
}
