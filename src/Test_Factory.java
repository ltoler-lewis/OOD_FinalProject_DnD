import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class TestFactory {

    //Bag_Factory bf;
	Bag d;
	Bag f;
	Bag w;
	Bag b;
    Bag_Factory bf_d;
    Bag_Factory bf_f;
    Bag_Factory bf_b;
    Bag_Factory bf_w;
    Character test_chara1;
    Character test_chara2;
    Character test_chara3;
    Character test_chara4;

    @BeforeEach                                         
    void setUp() {
        test_chara1 = new Character();
        test_chara2 = new Character();
        test_chara3= new Character();
        test_chara4 = new Character();
        
        bf_d = new Bag_Druid();
        d = bf_d.createBag(test_chara1);
        
        bf_f = new Bag_Druid();
        f = bf_f.createBag(test_chara2);
        
        bf_w = new Bag_Druid();
        w = bf_w.createBag(test_chara3);
        
        bf_b = new Bag_Bard();
        b = bf_b.createBag(test_chara4);
        

    }

    @Test                                               
    @DisplayName("Simple multiplication should work")   
    void testAssignment() {
    	test_chara1.bag.printContents(); 
    	test_chara2.bag.printContents();
    	test_chara3.bag.printContents();
    	test_chara4.bag.printContents();
    }

    @RepeatedTest(5)                                    
    @DisplayName("Ensure correct handling of zero")
    void testFill() {
    	d.printContents(); 
    	b.printContents();
    	w.printContents();
    	b.printContents();
    }
}