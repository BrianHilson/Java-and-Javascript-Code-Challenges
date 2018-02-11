function chunkArrayInGroups(arr, size) {
  var newArray = [];
  for (var i = 0; i < arr.length; i += size) {
    var chunk = arr.slice(i, i+size);
    newArray.push(chunk);  
  }
  return newArray;
}
