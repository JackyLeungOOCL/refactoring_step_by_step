# refactoring_step_by_step
1. add test
1. test succeed
1. in class Driver, create age getter
1. in class Police, change usage of driver.age -> driver.getAge()
1. in class Driver, change age to private
1. test succeed

1. in class Police, add private int adult age = 18
1. in if-else condition, change 18 to adult age
1. test succeed

1. in class Police, clean checkDriver duplicated return
1. test succeed

1. in class Police, create method checkDriverAdult same as checkDriver
1. in test, replace checkDriver -> checkDriverAdult
1. in class Police, remove checkDriver()
1. test succeed
