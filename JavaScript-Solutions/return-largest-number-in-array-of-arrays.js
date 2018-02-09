function largestInArrayOfArrays(arr) {
  var largest = [];
  for (var i = 0; i < arr.length; i++) {
    var maxNum = arr[i][0];
    for (var j = 1; j < arr[i].length; j++) {
      if (maxNum < arr[i][j]) {
        maxNum = arr[i][j];
      }
    }
    largest.push(maxNum);
  }
  
    
  return largest;
}
