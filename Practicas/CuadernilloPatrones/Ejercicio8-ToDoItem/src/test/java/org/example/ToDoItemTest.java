package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.RuntimeException;
import java.time.LocalDate;
public class ToDoItemTest {
    ToDoItem item1, item2, item3, item4;

    @BeforeEach
    void setUp() throws Exception{
        item1 = new ToDoItem("Repaso");
        item2 = new ToDoItem("Framework");
        item3 = new ToDoItem("Patrones");
        item4 = new ToDoItem("Refactoring");
    }

    @Test
    public void TestTareaSinInicializar(){
        RuntimeException trown = Assertions.assertThrows(RuntimeException.class, () -> {item1.start();});
    }

    @Test
    public void TestStart(){
        item1.changeState(new Finished());
    }

    @Test
    public void TestTogglePause(){
        item1.changeState(new Paused());
        item3.changeState(new InProgress());
        item4.changeState(new Finished());

        item1.togglePause();

        RuntimeException thrown = Assertions.assertThrows(
                RuntimeException.class,
                () -> item2.togglePause()
        );

        item3.togglePause();

        RuntimeException thrown2 = Assertions.assertThrows(
                RuntimeException.class,
                () -> item4.togglePause()
        );

        item3.togglePause();

        RuntimeException thrown3 = Assertions.assertThrows(
                RuntimeException.class,
                () -> item4.togglePause()
        );

        Assertions.assertTrue(item1.getState().getClass() == InProgress.class);
        Assertions.assertTrue(item3.getState().getClass() == Paused.class);
    }
}
