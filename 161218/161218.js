var x = Array(10);
for (var y in x) {
    x[y] = Math.floor(Math.random() * 200);
}
for (var y in x) {
    console.log(x[y]);
}
var sum = 0;
for (var y in x) {
    sum += x[y];
}
console.log("sum:" + sum);
console.log("avg:" + (sum / x.length));
var max = 0;
var maxi;
for (var y in x) {
    if (x[y] > max) {
        max = x[y];
        maxi = y;
    }
}
console.log("max:" + max);
console.log("max index:" + maxi);
var min = 0;
var mini;
for (var y in x) {
    if (x[y] < min) {
        min = x[y];
        mini = y;
    }
}
console.log("min:" + min);
console.log("min index:" + mini);
var sum1 = 0;
var sum2 = 0;
for (var y in x) {
    if (x[y] % 2 == 0) {
        sum2 += x[y];
    }
    else {
        sum1 += x[y];
    }
}
console.log("even:" + sum2);
console.log("odd:" + sum1);
var c1 = 0;
for (var y in x) {
    if (x[y] > 0) {
        c1++;
    }
}
console.log("positive num:" + c1);
var c2 = 0;
for (var y in x) {
    if (x[y] = 0) {
        c2++;
    }
}
console.log("num of zeroes:" + c2);
