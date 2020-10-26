package text1;

import javax.swing.*;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



public class Main {
	
	//用于存储学生信息（泛型）
	ArrayList<Student> a = new ArrayList<Student>();

	//无参数的构造方法
	//给a赋初始的值
	public Main() {
		a.add(new Student("2018030601", "张三", 60, 70, 80));
		a.add(new Student("2018030602", "李四", 67, 50, 90));
		a.add(new Student("2018030603", "王五", 75, 66, 47));
		a.add(new Student("2018030604", "赵六", 81, 70, 61));
		a.add(new Student("2018030605", "田七", 90, 78, 88));
		a.add(new Student("2018030606", "田七", 60, 60, 60));
		a.add(new Student("1", "abc", 90, 78, 88));

	}

	//登录界面
	public void login() {
		//建立页面
		JFrame jFrame = new JFrame("登录界面");
		jFrame.setLayout(null);
		//设置页面位置和大小
		jFrame.setBounds(500, 300, 400, 500);

		//建立标签
		JLabel jLabel1 = new JLabel("用户名：");
		jLabel1.setBounds(50, 50, 70, 20);
		jFrame.add(jLabel1);

		//建立输入框
		JTextField jTextField = new JTextField();
		jTextField.setBounds(120, 50, 150, 20);
		jFrame.add(jTextField);

		JLabel jLabel2 = new JLabel("密码：");
		jLabel2.setBounds(50, 100, 70, 20);
		jFrame.add(jLabel2);

		JTextField jTextField2 = new JTextField();
		jTextField2.setBounds(120, 100, 150, 20);
		jFrame.add(jTextField2);

		//建立按钮
		JButton jButton1 = new JButton("登录");
		jButton1.setBounds(50, 130, 60, 40);
		jFrame.add(jButton1);
		//给按钮添加事件
		jButton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String username = jTextField.getText().trim();
				String userpassword = jTextField2.getText().trim();
				if (username.equals("abc") && userpassword.equals("123")) {
					JOptionPane.showMessageDialog(null, "登录成功！");
					main_jframe();
				} else {
					JOptionPane.showMessageDialog(null, "登录失败,请点击确定，重新输入！");
				}

			}
		});

		//设置页面可见
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

	//主界面
	public void main_jframe() {
		JFrame jFrame1 = new JFrame("主界面");
		jFrame1.setLayout(null);
		jFrame1.setBounds(400, 200, 500, 500);

		//查询全部信息按钮
		JButton jButton1 = new JButton("查询全部信息");
		jButton1.setBounds(50, 50, 180, 40);
		//给按钮添加事件
		jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				select_all();
			}
		});

		// 按学号查询按钮
		JButton jButton2 = new JButton("按学号查询");
		jButton2.setBounds(50, 150, 100, 40);
		//给按钮添加事件
		jButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				select_id();
			}
		});

		// 按姓名查询按钮
		JButton jButton3 = new JButton("按姓名查询");
		jButton3.setBounds(200, 150, 100, 40);
		//给按钮添加事件
		jButton3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				select_name();
			}
		});

		// 添加学生信息按钮
		JButton jButton4 = new JButton("添加");
		jButton4.setBounds(50, 250, 60, 40);
		//给按钮添加事件
		jButton4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				add_Student();
			}
		});

		//删除学生信息按钮
		JButton jButton5 = new JButton("删除");
		jButton5.setBounds(150, 250, 60, 40);
		//给按钮添加事件
		jButton5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				delete_Student();

			}
		});

		//查询不及格学生信息的按钮
		JButton jButton6 = new JButton("查询不及格");
		jButton6.setBounds(50, 350, 120, 40);
		//给按钮添加事件
		jButton6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				select_sad();
			}
		});

		//将按钮添加到界面上
		jFrame1.add(jButton1);
		jFrame1.add(jButton2);
		jFrame1.add(jButton3);
		jFrame1.add(jButton4);
		jFrame1.add(jButton5);
		jFrame1.add(jButton6);

		//设置页面可见
		jFrame1.setVisible(true);
		jFrame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

	//查询学生全部信息界面
	public void select_all() {
		JFrame jFrame3 = new JFrame("查询学生全部信息界面");
		jFrame3.setBounds(300, 80, 800, 800);

		String st = new String();
		//建立文本显示区域
		JTextArea j = new JTextArea();

		st = a.get(0).toString() + "\n\n";
		for (int i = 1; i < a.size(); i++) {
			st = st + a.get(i).toString() + "\n\n";
		}
		//给文本区域添加信息
		j.setText(st);
		//将文本区域添加到页面上
		jFrame3.add(j);
		//设置页面可见
		jFrame3.setVisible(true);

	}

	//通过id查询学生信息界面
	public void select_id() {
		JFrame jFrame4 = new JFrame("通过id查询学生信息界面");
		jFrame4.setBounds(300, 80, 800, 800);
		jFrame4.setLayout(null);

		JLabel jLabel1 = new JLabel("学号：");
		jLabel1.setBounds(50, 50, 70, 20);
		jFrame4.add(jLabel1);

		JTextField jTextField = new JTextField();
		jTextField.setBounds(220, 50, 150, 20);
		jFrame4.add(jTextField);

		jLabel1.setBounds(120, 50, 150, 20);

		JButton jButton4 = new JButton("查询：");
		jButton4.setBounds(230, 100, 100, 40);
		jButton4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//获取输入框的信息
				String id = jTextField.getText().trim();
				//建立新的页面
				JFrame jFrame5 = new JFrame("id为<" + id + ">查询学生信息界面");
				jFrame5.setBounds(300, 80, 800, 800);
				
				JTextArea j = new JTextArea("没有查到！");
				for (int i = 0; i < a.size(); i++) {
					if (a.get(i).getId().equals(id)) {
						j.setText(a.get(i).toString());
					}
				}
				jFrame5.add(j);

				jFrame5.setVisible(true);
			}
		});

		jFrame4.add(jButton4);
		jFrame4.setVisible(true);

	}
	
	//通过name查询学生信息界面
	public void select_name() {
		JFrame jFrame4 = new JFrame("通过name查询学生信息界面");
		jFrame4.setBounds(300, 80, 800, 800);
		jFrame4.setLayout(null);

		JLabel jLabel1 = new JLabel("名字：");
		jLabel1.setBounds(50, 50, 70, 20);
		jFrame4.add(jLabel1);

		JTextField jTextField = new JTextField();
		jTextField.setBounds(220, 50, 150, 20);
		jFrame4.add(jTextField);

		jLabel1.setBounds(120, 50, 150, 20);

		JButton jButton4 = new JButton("查询：");
		jButton4.setBounds(230, 100, 100, 40);
		jButton4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = jTextField.getText().trim();
				JFrame jFrame5 = new JFrame("名字为：<" + name + ">查询学生信息界面");
				jFrame5.setBounds(300, 80, 800, 800);

				JTextArea j = new JTextArea("没有查到！");
				String st="";
				
				for (int i = 0; i < a.size(); i++) {
					if (a.get(i).getName().equals(name)) {
						st=st+a.get(i).toString()+"\n\n";
					}
				}
				j.setText(st);
				jFrame5.add(j);

				jFrame5.setVisible(true);
			}
		});

		jFrame4.add(jButton4);
		jFrame4.setVisible(true);

	}

	//添加学生信息界面
	public void add_Student() {
		JFrame jFrame = new JFrame("添加学生信息界面");
		jFrame.setLayout(null);
		jFrame.setBounds(500, 300, 400, 500);

		JLabel id = new JLabel("学号：");
		id.setBounds(50, 50, 70, 20);
		jFrame.add(id);

		JTextField id1 = new JTextField();
		id1.setBounds(120, 50, 150, 20);
		jFrame.add(id1);

		JLabel name = new JLabel("姓名：");
		name.setBounds(50, 100, 70, 20);
		jFrame.add(name);

		JTextField name1 = new JTextField();
		name1.setBounds(120, 100, 150, 20);
		jFrame.add(name1);

		JLabel eng = new JLabel("英语成绩：");
		eng.setBounds(50, 150, 70, 20);
		jFrame.add(eng);

		JTextField eng1 = new JTextField();
		eng1.setBounds(120, 150, 150, 20);
		jFrame.add(eng1);

		JLabel java = new JLabel("java成绩：");
		java.setBounds(50, 200, 70, 20);
		jFrame.add(java);

		JTextField java1 = new JTextField();
		java1.setBounds(120, 200, 150, 20);
		jFrame.add(java1);

		JLabel lin = new JLabel("数据结构成绩：");
		lin.setBounds(50, 250, 70, 20);
		jFrame.add(lin);

		JTextField lin1 = new JTextField();
		lin1.setBounds(120, 250, 150, 20);
		jFrame.add(lin1);

		JButton jButton4 = new JButton("添加：");
		jButton4.setBounds(100, 300, 100, 40);
		jButton4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//从输入框中提取数据
				String id2 = id1.getText().trim();
				String name2 = name1.getText().trim();
				//将输入框中的String型数据转化成int型
				int eng2 = Integer.parseInt(eng1.getText().trim());
				int java2 = Integer.parseInt(java1.getText().trim());
				int lin2 = Integer.parseInt(lin1.getText().trim());
				//根据id查询是否已经存在学生的信息
				boolean in = false;
				for (int i = 0; i < a.size(); i++) {
					if (a.get(i).getId().equals(id2)) {
						in = true;
					}
				}
				if (in) {
					JOptionPane.showMessageDialog(null, "添加失败，学生" + id2 + "已经存在！！");
				} else {
					Student b = new Student(id2, name2, eng2, java2, lin2);
					a.add(b);
					JOptionPane.showMessageDialog(null, "添加" + b.toString() + "成功");
				}

			}
		});
		jFrame.add(jButton4);
		jFrame.setVisible(true);
	}

	//删除学生信息界面
	public void delete_Student() {
		JFrame jFrame4 = new JFrame("删除学生信息界面");
		jFrame4.setBounds(300, 80, 800, 800);
		jFrame4.setLayout(null);

		JLabel jLabel1 = new JLabel("学号：");
		jLabel1.setBounds(50, 50, 70, 20);
		jFrame4.add(jLabel1);

		JTextField jTextField = new JTextField();
		jTextField.setBounds(220, 50, 150, 20);
		jFrame4.add(jTextField);

		jLabel1.setBounds(120, 50, 150, 20);

		JButton jButton4 = new JButton("删除：");
		jButton4.setBounds(230, 100, 100, 40);
		jButton4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = jTextField.getText().trim();

				//查询所要删除的学生信息是否存在
				boolean in = false;//学生存在的标志位
				int j = 0;//用于存储所要删除学生在a中的位置
				for (int i = 0; i < a.size(); i++) {
					if (a.get(i).getId().equals(id)) {
						in = true;
						j = i;
					}
				}
				if (in) {
					//要删除的学生存在，则把要删除的学生去除
					ArrayList<Student> b = new ArrayList<Student>();
					for (int i = 0; i < a.size() && i != j; i++) {
						b.add(a.get(i));
					}
					a = b;
					JOptionPane.showMessageDialog(null, "删除学生信息成功！！");
				} else {
					JOptionPane.showMessageDialog(null, "所要删除的学生信息不存在！！请重新输入！");
				}

			}
		});

		jFrame4.add(jButton4);
		jFrame4.setVisible(true);

	}

	//查询不及格的学生信息界面
	public void select_sad() {
		JFrame jFrame3 = new JFrame("查询不及格的学生信息界面");
		jFrame3.setBounds(300, 80, 800, 800);

		String st = "";
		JTextArea j = new JTextArea();

		for (int i = 0; i < a.size(); i++) {
			Student a1 = a.get(i);
			if (a1.getEng() < 60 || a1.getJava() < 60 || a1.getLin() < 60) {
				st = st + a1.toString() + "\n\n";
			}
		}
		j.setText(st);
		jFrame3.add(j);

		jFrame3.setVisible(true);
	}

	//主函数
	public static void main(String[] args) {
		Main m = new Main();
		//调用登录界面
		m.login();

	}
}
