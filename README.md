# kondo-static-field-repro

## To exhibit the issue

```sh
$ clj-kondo --version
clj-kondo v2024.11.14
```

```sh
$ clj-kondo --lint src/
src/kondo_static_field_repro/core.clj:7:1: error: Static fields should be referenced without parens unless they are intended as function calls
src/kondo_static_field_repro/core.clj:10:1: error: Static fields should be referenced without parens unless they are intended as function calls
src/kondo_static_field_repro/core.clj:16:1: error: Static fields should be referenced without parens unless they are intended as function calls
linting took 7ms, errors: 3, warnings: 0
```

## Expected

```sh
$ clj-kondo --lint src/
src/kondo_static_field_repro/core.clj:7:1: error: Static fields should be referenced without parens unless they are intended as function calls
src/kondo_static_field_repro/core.clj:10:1: error: Static fields should be referenced without parens unless they are intended as function calls
src/kondo_static_field_repro/core.clj:13:1: error: Static fields should be referenced without parens unless they are intended as function calls
src/kondo_static_field_repro/core.clj:16:1: error: Static fields should be referenced without parens unless they are intended as function calls
linting took 7ms, errors: 4, warnings: 0
```
