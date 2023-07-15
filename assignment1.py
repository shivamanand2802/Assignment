def func(arr, count):
    count = count % len(arr)
    rotated_arr = arr[- count : ] + arr[ : - count]
    
    return rotated_arr

arr = [1,2,3,4,5]
count = 2
result = func(arr,count)
print(result)