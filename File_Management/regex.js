let x = "/*text*/tes /*test*/";
let regcheck = /[^\*[\s\S]*? |\*$]*/;
// let result =  regcheck.test(x);
let result = x.match(regcheck);
console.log(result)