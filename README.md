# sucre - it's sweet
___
```sucre
start it.                                                                                                        CODE
import_pack: output_1 -> out|allows any_type & any_length|.
import_pack: input_1 -> in|allows any_type & any_length|.
out() has "hello, world! this is quite sweet & nice".
string opinion equals in() has "isn't it?".
out() has var_opinion.
end it.
```

```
hello, world! this is quite sweet & nice                                                                       OUTPUT
isn't it?
yeah, i agree!
```
___
&emsp;**Sucre**[^1] is a *high-level*, *keyword-oriented*/*esoteric* programming language that is made to be *extremely readable* and just a *simple*, *fun* language.<sup><sub>definitely isn't *fun* to build though...</sub></sup>

![Total Downloads](https://img.shields.io/github/downloads/davud-dev/sucre/total)

&emsp;Anyways, it has *clean*/*readable* syntax<sup><sub>thanks captain obvious!</sub></sup> and *flexible* rules.
For example, let's take this simple import line,\
`import_pack: output -> out|allow any_type & any_length| .`:
* `import_pack:` -> prefix for package importing.
* `output -> out` -> specifies the output package, but it isn't actually importing the out function, it's actually creating a new function named 'out' that is the 1st(and only) output function.
* `|allows any_type & any_length|` -> `allows` keyword specific to new package function for specifying any limits, but `any_type & any_length` just practically mean it's your average output function. We could've also used the `anyy` keyword that means the same thing but it's shortened, but this was for the sake of readabillity and understanding.
* `.` -> statement ender;

&emsp;It is run through the $$\textcolor{#FFD700}{\text{**JVM**}}$$[^2] & it is *strictly-typed*, but does support the `any` type.
It has unconventional syntax, but it is all-purpose and introduces new features alongside a lot of *customizabillity*, just like how you can have your *sucre* either granulated, light brown, dark brown, free-flowing brown, powdered, superfine, liquid, invert, sanding, coarse, fruit, moscovado, turbinado or baker's special.

### treat yourself with some sucre
- [documentation](docs_land.md);
- [how to use it](install_land.md);
- [some examples](examples_land.md);
___
[^1]: french word for sugar, referring to the crystalline sweetener found in sweets and beverages.
[^2]: The Java Virtual Machine, a mini-computer installed onto almost all operating systems that can compile .java files into bytecode(.class) files.
