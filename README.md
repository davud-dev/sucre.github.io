# sucre - it's sweet
```sucre
start it.
import pack: output_1 -> out|allows any_type & any_length|.
import pack: input_1 -> in|allows any_type & any_length|.
out() has "hello, world! this is quite sweet & nice".
string opinion equals in() has "isn't it?".
out() has var_opinion.
end it.
```

```
hello, world! this is quite sweet & nice
isn't it?
yeah, i agree!
```

&emsp;Sucre[^1] is a high-level, keyword-oriented/esoteric programming language that is made to be extremely readable and just a simple, fun language.<sup><sub>definitely isn't fun to build though...</sub></sup> 

&emsp;Anyways, it has clean/readable syntax<sup><sub>thanks captain obvious!</sub></sup> and flexible rules.
For example, let's take this simple import line `import pack: output -> out|allow any_type & any_length| .`:
* `import pack:` -> prefix for package importing.
* `output -> out` -> specifies the output package, but it isn't actually importing the out function, it's actually creating a new function named 'out' that is the 1st(and only) output function.
* `|allows any_type & any_length|` -> `allows` keyword specific to new package function for specifying any limits, but `any_type & any_length` just practically mean it's your average output function. We could've also used the `anyy` keyword that means the same thing but it's shortened, but this was for the sake of readabillity and understanding.
* `.` -> statement ender;



[^1]: french word for sugar, referring to the crystalline sweetener found in sweets and beverages.
