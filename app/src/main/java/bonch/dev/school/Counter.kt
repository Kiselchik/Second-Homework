package bonch.dev.school

class Counter(startCount: Int =0) {
    var currentCount=startCount
    private set
    fun increment(){
        ++currentCount
    }
}