package threads

import java.util.concurrent.BlockingQueue
import java.util.concurrent.LinkedBlockingQueue

BlockingQueue queue = new LinkedBlockingQueue();

Thread.start('Producer') {
    10.times {
        println(Thread.currentThread().name + " adding $it")
        queue << it
        sleep(100)
    }
}

Thread.start('Consumer') {
    for(i in 0..9){
        sleep(200)
        print(Thread.currentThread().name)
        println("consuming ${queue.take()}")
    }
}

//// sequencial push pop
//list =[]
//
//// push
//10.times { num ->
//    println("pushing $num")
//    list.push(num)
//}
//
////pop
//for(i in 9..0){
//    println("pop($i)")
//    list.pop()
//}
//
//println(list)