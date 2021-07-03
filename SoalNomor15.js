function f(input) {
    let value = "";
    for(let i = input ; i > 0 ; i--){
    var blank = " ".repeat(input-i);
    value += blank + "*".repeat(i) + blank;
    value += i < input ? "\n" : "\n";
    };
    for(let i = 2 ; i <= input ; i++){
    var blank = " ".repeat(input-i);
    value += blank + "*".repeat(i) + blank;
    value += i < input ? "\n" : "\n";
    };
    return value
};

console.log(f(10));
console.log(f(11);
