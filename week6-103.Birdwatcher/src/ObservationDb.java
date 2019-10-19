
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Warglaive
 */
public class ObservationDb {

    public ArrayList<Bird> Birds;
    public int TimesObserved;

    public ObservationDb() {
        this.Birds = new ArrayList<Bird>();
        this.TimesObserved = 0;
    }

    public void Add(Bird bird) {
        this.Birds.add(bird);
    }

    public void Observation(String birdName) {
        for (Bird currentBird : this.Birds) {
            if (currentBird.Name.equals(birdName)) {
                currentBird.Count++;
                break;
            }
        }
    }
}
