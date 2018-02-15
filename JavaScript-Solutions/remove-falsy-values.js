function bouncer(arr) {
  var newArr = [];
  for (var i = 0; i < arr.length; i++) {
    if (arr[i] === false) {
    } else if (arr[i] === null) {   
    } else if (arr[i] === 0) {   
    } else if (arr[i] === "") {   
    } else if (arr[i] === undefined) {   
    } else if (isNaN(arr[i]) && typeof arr[i] !== "string") {   
    } else {
      newArr.push(arr[i]);
    }
  }
  return newArr;
}
