# Compiler2025-Team27

**Template Language Compiler** — Python (Flask) + Jinja2 → HTML/CSS

Academic project for the Compilers course (2025/2026).  
Builds a multi-language compiler that analyzes Flask backend code and Jinja2 templates, performs semantic checks, and generates static HTML pages with dynamic product data.

---

## Overview

The compiler processes a Flask application written in Python together with Jinja2 templates. It constructs two Abstract Syntax Trees (ASTs), runs semantic analysis on both sides, extracts runtime data from Python, and generates complete HTML pages.

| Component | Role |
|-----------|------|
| Python (Flask) | Backend logic, routes, product data |
| Jinja2 | Template structure and variable binding |
| HTML / CSS | Final generated interface |
| Java (ANTLR) | Lexer, Parser, AST, Semantic Analysis, Code Generation |
| Embedded Java Server | Runtime regeneration after add / edit / delete |

---

## Compiler Pipeline

```
app.py ──► Python Lexer ──► Python Parser ──► Python AST
                                              │
                                              ▼
                                    Semantic Analysis
                                              │
                                              ▼
                                       Data Extractor
                                              │
                                              ▼
templates/*.jinja ──► Jinja Lexer ──► Jinja Parser ──► Jinja AST
                                                          │
                                                          ▼
                                                   HtmlGenerator
                                                          │
                                                          ▼
                                              output/*.html + assets
```

1. **Lexical & Syntax Analysis** — ANTLR grammars for Python and Jinja2/HTML/CSS
2. **AST Construction** — Two separate trees (Python AST + Jinja AST) using the Visitor pattern
3. **Semantic Analysis** — Symbol Table + type/scope checks (at least five error categories)
4. **Code Generation** — Data from Python is bound into Jinja templates to produce HTML
5. **Runtime Regeneration** — A Java HTTP server listens for product changes and regenerates pages

---

## Project Structure

```
Compiler2025-Team27/
├── app.py                          # Flask backend (input)
├── templates/                      # Jinja2 templates (input)
│   ├── index.jinja
│   ├── add_product.jinja
│   ├── edit_product.jinja
│   └── product_details.jinja
├── static/
│   ├── style.css
├── src/
│   ├── antlr/                      # Generated lexer/parser + .g4 grammars
│   ├── ast/
│   │   ├── paython/                # Python AST node hierarchy
│   │   └── web/                    # Jinja/HTML AST node hierarchy
│   ├── visitor/                    # AST builders + semantic checks
│   ├── symbol_table/               # Symbol Table, scopes, types
│   ├── generator/                  # Data extraction + HTML generation
│   ├── server/                     # Embedded Java server (regeneration)
│   └── app/
│       ├── CompilerMain.java       # Full compile pipeline
│       └── SemanticErrorTestMain.java
├── output/                         # Generated HTML + copied assets
├── compiler_output/                # AST dumps, semantic report, generation log
└── example/                        # Semantic error test cases
```

---

## Features

### 1. Dual AST Construction
- **Python AST** — Assignments, functions, decorators, loops, conditionals, calls
- **Jinja AST** — HTML elements, attributes, `{% for %}`, `{% if %}`, `{% set %}`, `{{ expr }}`
- Every node stores its type name and source line number
- OOP design: inheritance and polymorphism across node classes

### 2. Semantic Analysis (5+ error categories)

| # | Category | Example |
|---|----------|---------|
| 1 | Undefined Variable | Use of a name never assigned |
| 2 | Type Error | `for x in 10`, calling an int, indexing an int |
| 3 | Scope Error | Accessing a local variable outside its function |
| 4 | Type Mismatch | Assigning `str` to a variable previously typed as `int` |
| 5 | Missing Flask Variable | Template uses a name not passed via `render_template` |

Additional checks: duplicate parameters, function redefinition, undefined functions/objects.

### 3. Code Generation
- Extracts the `products` list and route map from the Python AST
- Evaluates Jinja expressions and expands `{% for %}` loops
- Emits complete HTML pages under `output/`
- Copies supporting files (`app.py`, `style.css`) without modification

### 4. Web Interface & Navigation
- Product list
- Add product
- Product details
- Edit product
- Delete product

Smooth navigation between pages via generated links.

### 5. Runtime Regeneration
The embedded Java server (`AppServer`) keeps product data in memory.  
On every add / edit / delete request it re-runs the same `HtmlGenerator` so the HTML stays synchronized with the data.

### 6. Readable Printing
- Node-level `print()` methods for structured AST display
- JSON dumps of both ASTs (`ast_python.json`, `ast_jinja.json`)
- Symbol table dump and semantic error report

---

## Generated Artifacts

After running `CompilerMain`:

```
output/
├── index.html
├── add_product.html
├── edit_product.html
├── product_details.html
├── app.py
└──style.css


compiler_output/
├── ast_python.json
├── ast_jinja.json
├── semantic_report.txt
└── generation_log.txt
```

---

## How to Run

### Prerequisites
- JDK 17+ (or the JDK configured in your IDE)
- ANTLR 4.13.2 (`dependecies/antlr-4.13.2-complete.jar`)

### Full Compilation Pipeline
Run:

```
app.CompilerMain
```

This parses `app.py` and the templates, builds both ASTs, runs semantic analysis, generates HTML, and writes the compiler reports.

### Semantic Error Tests
Run:

```
app.SemanticErrorTestMain
```

Uses:
- `example/semantic_errors_python.py`
- `example/semantic_errors_web.jinja`

Prints all detected Python errors, then all Web/Jinja errors, with a summary count.

### Live Server (Regeneration)
Run:

```
server.AppServer
```

Then open:

```
http://localhost:8080
```

Add, edit, or delete products; the server regenerates the corresponding HTML on each change.

---

## Semantic Error Test Coverage

**Python file covers:**
- Type mismatch (assignment & comparison)
- Not iterable / not callable / not subscriptable
- Undefined variable
- Out-of-scope variable
- Function already defined
- Duplicate parameter
- Function not defined
- Object not defined (decorator)

**Web file covers:**
- Not iterable / not callable / not subscriptable
- Missing Flask variable
- Undefined template variable

---

## Team

Compiler2025 — Team 27

---

## Academic Context

Course: Compilers (مترجمات) — 2025/2026  
Frameworks: ANTLR 4, Java, Flask concepts, Jinja2  
Engineers: M. Aya Shahada, M. Sarah Al-Muqabaa
