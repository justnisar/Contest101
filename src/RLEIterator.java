import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

class RLEIterator {

    private int[] A;
    private int current;
    public RLEIterator(int[] A) {

        A = this.A;
        current = 0;

    }

    public int next(int n) {

        if(current >= A.length)
            return -1;

        while(current < A.length && A[current] < n ){
            n-= A[current];
            current += 2;

        }

        if(current >= A.length)
            return -1;

        A[current] -= n;
        return A[current + 1];
    }
}

/*
["RLEIterator","next","next","next","next","next","next","next","next","next","next"]
[[[811,903,310,730,899,684,472,100,434,611]],[358],[345],[154],[265],[73],[220],[138],[4],[170],[88]]
 */

/*

[null,903,903,730,684,684,684,684,684,684,684]
 */