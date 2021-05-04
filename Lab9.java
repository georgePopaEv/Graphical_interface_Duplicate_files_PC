package Lab1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.io.File;
import java.nio.channels.NonReadableChannelException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultTreeSelectionModel;

import com.sun.source.util.TreePath;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.border.TitledBorder;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lab9 extends JFrame {

	private JPanel contentPane;
	private JTextField txtDdmmyyyy;
	private JTextField txtDdmmyyyy_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab9 frame = new Lab9();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Lab9() {
		setTitle("File Duplicate PGA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 499);
		setResizable(false);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Run aplication...");
		mntmNewMenuItem.setIcon(new ImageIcon(Lab9.class.getResource("/imagini/FileMenu/run.png")));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Windows Control Panel");
		mntmNewMenuItem_1.setIcon(new ImageIcon(Lab9.class.getResource("/imagini/FileMenu/control panel.png")));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Rescue Center...");
		mntmNewMenuItem_2.setIcon(new ImageIcon(Lab9.class.getResource("/imagini/FileMenu/1698510.png")));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Settings...");
		mntmNewMenuItem_3.setIcon(new ImageIcon(Lab9.class.getResource("/imagini/FileMenu/settings.png")));
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Check for Updates");
		mntmNewMenuItem_4.setIcon(new ImageIcon(Lab9.class.getResource("/imagini/FileMenu/update.png")));
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Close");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmNewMenuItem_5.setIcon(new ImageIcon(Lab9.class.getResource("/imagini/FileMenu/close1.png")));
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_1 = new JMenu("Pages");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Duplicate File Finder");
		mntmNewMenuItem_6.setIcon(new ImageIcon(Lab9.class.getResource("/imagini/PagesMenu/duplicate.png")));
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Raports");
		
		mntmNewMenuItem_8.setIcon(new ImageIcon(Lab9.class.getResource("/imagini/PagesMenu/reports.png")));
		mnNewMenu_1.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("File Duplicate Store");
		mntmNewMenuItem_7.setIcon(new ImageIcon(Lab9.class.getResource("/imagini/PagesMenu/store.png")));
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JMenu mnNewMenu_2 = new JMenu("Help");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Online Manual");
		mntmNewMenuItem_9.setIcon(new ImageIcon(Lab9.class.getResource("/imagini/HelpMenu/manual.png")));
		mnNewMenu_2.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Visit Website");
		mntmNewMenuItem_13.setIcon(new ImageIcon(Lab9.class.getResource("/imagini/HelpMenu/visit webpage.png")));
		mnNewMenu_2.add(mntmNewMenuItem_13);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Visit Program Page");
		mntmNewMenuItem_12.setIcon(new ImageIcon(Lab9.class.getResource("/imagini/HelpMenu/visit program.png")));
		mnNewMenu_2.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Downlaod Free Duplicate");
		mntmNewMenuItem_11.setIcon(new ImageIcon(Lab9.class.getResource("/imagini/HelpMenu/download.png")));
		mnNewMenu_2.add(mntmNewMenuItem_11);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Technical Support");
		mntmNewMenuItem_10.setIcon(new ImageIcon(Lab9.class.getResource("/imagini/HelpMenu/support.png")));
		mnNewMenu_2.add(mntmNewMenuItem_10);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu_2.add(separator_2);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Send Feedback");
		mntmNewMenuItem_14.setIcon(new ImageIcon(Lab9.class.getResource("/imagini/HelpMenu/feedback.png")));
		mnNewMenu_2.add(mntmNewMenuItem_14);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Send Debug Log");
		mntmNewMenuItem_15.setIcon(new ImageIcon(Lab9.class.getResource("/imagini/HelpMenu/debug log.png")));
		mnNewMenu_2.add(mntmNewMenuItem_15);
		
		JSeparator separator_3 = new JSeparator();
		mnNewMenu_2.add(separator_3);
		
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("About");
		mntmNewMenuItem_16.setIcon(new ImageIcon(Lab9.class.getResource("/imagini/HelpMenu/about.png")));
		mnNewMenu_2.add(mntmNewMenuItem_16);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Duplicate File Finder", new ImageIcon(Lab9.class.getResource("/imagini/PagesMenu/duplicate.png")), panel, null);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Raports", new ImageIcon(Lab9.class.getResource("/imagini/PagesMenu/reports.png")), panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Results:");
		lblNewLabel_1.setBounds(10, 10, 150, 20);
		panel_1.add(lblNewLabel_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 40, 548, 130);
		panel_1.add(scrollPane_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"test_sign", "D:/Test", "51.83Mb", "2/26/2021", ".vlc", "122"},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Nume Fisier", "Calea ", "Dimensiunea", "Data Crearii", "Tip Fisier(extensie)", "ID Group"
			}
		));
		table.setEnabled(false);
		scrollPane_2.setViewportView(table);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Statistics:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(10, 195, 548, 130);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Numarul total de fisiere scanate: 23.032 ");
		lblNewLabel_9.setBounds(20, 20, 500, 20);
		panel_5.add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("Timpul in care s-a efectuat cautarea: 1 day 2 hour 57 minutes 34 secunds 115 milisecunds");
		lblNewLabel_9_1.setBounds(20, 55, 500, 20);
		panel_5.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10 = new JLabel("Numarul total de Fisiere gasite duplicat sunt: 5.042");
		lblNewLabel_10.setBounds(20, 90, 500, 20);
		panel_5.add(lblNewLabel_10);
		
		JButton btnNewButton_2 = new JButton("Research");
		btnNewButton_2.setBounds(426, 335, 132, 57);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Export Statistics");
		btnNewButton_3.setBounds(284, 335, 132, 57);
		panel_1.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 185, 382);
		panel.add(scrollPane);
		
		
		JCheckBoxTree cbt = new JCheckBoxTree();
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Disk Drives");
		cbt.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Disk Drives") {
				{
					File folder, f;
					File[] listOfFiles, lf;

//					for (File file : listOfFiles) {
//					    if (file.isDirectory()) {
////					        System.out.println(file.getName());
//					    }
//					}
					String pathfolder;
					DefaultMutableTreeNode node_1, node_2;
					String path1 = "/C:/";
					node_1 = new DefaultMutableTreeNode("Windows(C:)");
					folder = new File(path1);
					listOfFiles = folder.listFiles();
					for (File file : listOfFiles) {
						pathfolder = path1;
					    if (file.isDirectory()) {
					    	///Ceva de test este linia 201 impreuna cu 198
					    	node_2 = new DefaultMutableTreeNode(file.getName());
					    		pathfolder = pathfolder + (String) file.getName();
					    		f = new File(pathfolder);
					    		lf = f.listFiles();
					    		if (lf != null) {
					    			for (File file2 : lf) {
						    			if ((file2.isDirectory()) && lf.length > 1) {
						    				node_2.add(new DefaultMutableTreeNode(file2.getName()));
						    			}
						    			}
					    		}
					    	node_1.add(node_2);
					    }
					}
					add(node_1);

					
					String path2 = "/D:/";
					node_1 = new DefaultMutableTreeNode("Date(D:)");
					folder = new File(path2);
					listOfFiles = folder.listFiles();
					for (File file : listOfFiles) {
						pathfolder = path2;
					    if (file.isDirectory()) {
					    	///Ceva de test este linia 201 impreuna cu 198
					    	node_2 = new DefaultMutableTreeNode(file.getName());
					    		pathfolder = pathfolder + (String) file.getName();
					    		f = new File(pathfolder);
					    		lf = f.listFiles();
					    		if (lf != null) {
					    			for (File file2 : lf) {
						    			if ((file2.isDirectory()) && lf.length > 1) {
						    				node_2.add(new DefaultMutableTreeNode(file2.getName()));
						    			}
						    			}
					    		}
					    	node_1.add(node_2);
					    }
					}
					add(node_1);
				}
			}
		));
		cbt.addCheckChangeEventListener(new JCheckBoxTree.CheckChangeEventListener() {
            public void checkStateChanged(JCheckBoxTree.CheckChangeEvent event) {
//                System.out.println("event");
                javax.swing.tree.TreePath[] paths = cbt.getCheckedPaths();
                for (javax.swing.tree.TreePath tp : paths) {
                    for (Object pathPart : tp.getPath()) {
//                        System.out.print(pathPart + "/");
                    }                   
//                    System.out.println();
                }
            }           
        }); 
		scrollPane.setViewportView(cbt);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Cautarea fisierelor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(205, 10, 353, 79);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		ButtonGroup g = new ButtonGroup();
		ButtonGroup nume = new ButtonGroup();
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("cu acelasi continut");
		rdbtnNewRadioButton.setBounds(10, 20, 137, 20);
		panel_3.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("cu aceeasi dimensiune");
		rdbtnNewRadioButton_1.setBounds(170, 20, 161, 20);
		panel_3.add(rdbtnNewRadioButton_1);
		g.add(rdbtnNewRadioButton_1);
		g.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("cu acelasi nume");
		rdbtnNewRadioButton_2.setBounds(10, 42, 137, 21);
		panel_3.add(rdbtnNewRadioButton_2);
		nume.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("cu nume diferit");
		rdbtnNewRadioButton_3.setBounds(170, 42, 161, 21);
		panel_3.add(rdbtnNewRadioButton_3);
		nume.add(rdbtnNewRadioButton_3);
		
		JButton btnNewButton = new JButton("Search");
		
		btnNewButton.setBounds(438, 352, 120, 40);
		panel.add(btnNewButton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Filtrare dupa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(205, 99, 353, 233);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 35, 116, 126);
		panel_4.add(scrollPane_1);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {".*", ".txt", ".pdf", ".csv", ".java", ".py", ".cpp", ".ypinb", ".exe	"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setSelectedIndex(0);
		scrollPane_1.setViewportView(list);
		
		JLabel lblNewLabel = new JLabel("Extensie:");
		lblNewLabel.setBounds(10, 10, 60, 20);
		panel_4.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Perioada de timp:");
		lblNewLabel_3.setBounds(145, 14, 116, 20);
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("min: ");
		lblNewLabel_4.setBounds(149, 56, 45, 13);
		panel_4.add(lblNewLabel_4);
		
		txtDdmmyyyy = new JTextField();
		txtDdmmyyyy.setText("dd/mm/yyyy");
		txtDdmmyyyy.setBounds(218, 53, 96, 19);
		panel_4.add(txtDdmmyyyy);
		txtDdmmyyyy.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("max:");
		lblNewLabel_5.setBounds(149, 119, 45, 13);
		panel_4.add(lblNewLabel_5);
		
		txtDdmmyyyy_1 = new JTextField();
		txtDdmmyyyy_1.setText("dd/mm/yyyy");
		txtDdmmyyyy_1.setBounds(218, 116, 96, 19);
		panel_4.add(txtDdmmyyyy_1);
		txtDdmmyyyy_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("pana la");
		lblNewLabel_6.setBounds(200, 85, 45, 20);
		panel_4.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Dimensiune:");
		lblNewLabel_7.setBounds(10, 170, 82, 13);
		panel_4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_4_1 = new JLabel("min: ");
		lblNewLabel_4_1.setBounds(10, 190, 45, 20);
		panel_4.add(lblNewLabel_4_1);
		
		textField = new JTextField();
		textField.setText("50");
		textField.setBounds(65, 190, 40, 20);
		panel_4.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("byte");
		lblNewLabel_8.setBounds(115, 190, 45, 20);
		panel_4.add(lblNewLabel_8);
		
		JLabel lblNewLabel_5_1 = new JLabel("max:");
		lblNewLabel_5_1.setBounds(170, 190, 45, 20);
		panel_4.add(lblNewLabel_5_1);
		
		textField_1 = new JTextField();
		textField_1.setText("1500");
		textField_1.setColumns(10);
		textField_1.setBounds(218, 190, 40, 20);
		panel_4.add(textField_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("byte");
		lblNewLabel_8_1.setBounds(268, 190, 45, 20);
		panel_4.add(lblNewLabel_8_1);
		
		JButton btnNewButton_1 = new JButton("Clear all");
		btnNewButton_1.setBounds(318, 352, 111, 40);
		panel.add(btnNewButton_1);
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("File Duplicate Store", new ImageIcon(Lab9.class.getResource("/imagini/PagesMenu/store.png")), panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Magazinul Duplicate este Gol ");
		lblNewLabel_2.setBounds(200, 50, 250, 20);
		panel_2.add(lblNewLabel_2);
		
		JLabel astept = new JLabel("Va asteptam in cateva momente");
		astept.setBounds(200, 80, 250, 20);
		panel_2.add(astept);
		
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
