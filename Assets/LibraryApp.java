
//----- Imports
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class LibraryApp implements ActionListener { // Management

    Library lilberbly = new Library();

    JTextField genre;
    JTextField author;
    JTextField title;
    JLabel display;

    JButton jbtn;
    JLabel title1;

    JFrame jfrm;

    int booknum = 0;

    LibraryApp() {

        // --- Properties
        jfrm = new JFrame("The Library:");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(500, 500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        genre = new JTextField("Genre: ", 10);
        title = new JTextField("Title: ", 10);
        author = new JTextField("Author: ", 10);

        jbtn = new JButton("Enter: ");
        title1 = new JLabel("TWelcome to Isaiah's Library");
        display = new JLabel("Your Books are:");

        jbtn.addActionListener(this);

        /// ---- Adding Text Etc,
        jfrm.add(genre);
        jfrm.add(author);
        jfrm.add(title);

        jfrm.add(title);
        jfrm.add(jbtn);
        jfrm.add(display);

        jfrm.setVisible(true);

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LibraryApp();
            }
        });

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("Enter:")) {

            lilberbly.addBook(new Book(author.getText(), title.getText(), (genre.getText()))); // Adds to library

            // Take ze book and display
            JLabel jj = new JLabel();

            List<Book> bb = new ArrayList<>();

            bb = lilberbly.getBooks();
            Book b = bb.get(booknum);
            String n = b.toString();

            jj.setText(n + " " + Integer.toString(booknum));
            jfrm.add(jj);

            jfrm.setVisible(true);

            booknum += 1;

        }

    }
}
