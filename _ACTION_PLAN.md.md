\# CS-THESIS PROJECT: PRE-TESTING ACTION PLAN \*\*Date:\*\* December 4,
2025 \| \*\*Repository:\*\* hanzgeollegue/cs-thesis

\-\--

\## A. SUMMARY OF PROJECT STATUS AFTER PROGRESS REPORTING

\### Completed Features - Resume parsing and text extraction pipeline -
Candidate information extraction (name, contact details) - Experience
section parsing with multi-line bullet point merging - Projects section
parsing with project names, descriptions, and dates - PDF document
processing capability - Batch processing infrastructure for multiple
resumes

\### Applied Design Patterns - \*\*Pipeline Pattern:\*\* Modular
processing stages (PDF parsing → text extraction → information
extraction) - \*\*Caching Pattern:\*\* TF-IDF, PDF parser, and
Cross-Encoder caches for performance optimization - \*\*Factory
Pattern:\*\* Resume document creation and processing

\### Refactoring Accomplished - Fixed experience bullets merging to
handle multi-line bullet points spanning across text boundaries -
Improved projects parsing logic to properly group project lines into
structured blocks - Enhanced candidate name extraction with job title
filtering and filename fallback mechanism - Implemented automatic cache
clearing before batch processing to prevent stale data - Refined project
header detection to exclude action verb lines from project names - Added
bullets field to projects structure for improved data organization

\### Resolved Issues from Previous Feedback - Experience bullets no
longer fragment across multiple entries - Project parsing now correctly
identifies and groups related project information - Candidate name
extraction filters out erroneous job titles (e.g., \"BSIT Practicum
Coordinator\") - Cache management automated to ensure fresh processing
on batch operations

\-\--

\## B. IDENTIFIED AREAS FOR IMPROVEMENT

\*\*Minimum 3 areas requiring fixes/cleanup before testing:\*\*

1\. \*\*Output Validation & Data Consistency\*\*  - Verify all extracted
fields match expected resume data types and formats  - Validate that
null/empty values are handled consistently across all modules  - Ensure
date parsing produces standardized formats (MM/DD/YYYY vs YYYY-MM-DD)

2\. \*\*Error Handling & Edge Cases\*\*  - Test resume files with
unusual formatting, multi-column layouts, or non-standard sections  -
Verify graceful handling of PDFs with images, tables, and embedded
graphics  - Confirm proper error messages for corrupt or unreadable PDF
files

3\. \*\*Performance & Scalability\*\*  - Profile batch processing for
memory leaks or inefficient cache usage  - Test with large resume
datasets (100+ files) to identify bottlenecks  - Optimize Cross-Encoder
model performance for consistent extraction speeds

4\. \*\*Code Quality & Documentation\*\*  - Remove all debug print
statements from production code  - Add comprehensive docstrings to all
public functions and classes  - Document expected input/output formats
for each module

\-\--

\## C. PRE-TESTING PRIORITIES FOR NEXT MEETING

\*\*All teams must commit to completing:\*\*

\- \[ \] Ensure all Python modules compile without errors (\`python -m
py_compile \<module\>\`) - \[ \] Stabilize functions with inconsistent
outputs (profile with multiple test cases) - \[ \] Finalize expected
behaviors for each feature (create behavior specification document) - \[
\] Remove all debugging print statements from codebase - \[ \] Freeze
feature additions (no new features during test design phase) - \[ \]
Verify all dependencies are properly documented in requirements.txt

\-\--

\## D. ASSIGNMENT OF ROLES FOR TESTING

\*\*To avoid bias and ensure independent validation:\*\*

\| Role \| Assigned Team Member \|
\|\-\-\-\-\--\|\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\--\| \| \*\*Test
Case Designer\*\* \| \[Team Member Name 1\] \| \| \*\*Test Executor\*\*
\| \[Team Member Name 2\] \| \| \*\*Code Reviewer\*\* \| \[Team Member
Name 3\] \| \| \*\*Documentation Lead\*\* \| \[Team Member Name 4\] \|

\-\--

\## E. EVIDENCE OF IMPROVEMENTS

\### Updated Screenshots - \[Insert: Before/after screenshots of parsing
improvements\] - \[Insert: Example of improved candidate name
extraction\] - \[Insert: Projects section parsing comparison\]

\### Code Snippets (Before & After)

\*\*Before:\*\* Experience bullets merging (fragmented) \`\`\`python \#
Previous approach - bullets split incorrectly experience_bullets =
text.split(\'\\n\') \# Simple split loses context \`\`\`

\*\*After:\*\* Experience bullets merging (fixed) \`\`\`python \#
Improved approach - intelligently merges multi-line bullets def
merge_experience_bullets(raw_text): \# Groups related bullet points and
handles line continuations \# Properly identifies new bullets vs.
continuation lines pass \`\`\`

\### List of Issues Resolved Since Last Report - ✅ Multi-line
experience bullet fragmentation - ✅ Project parsing grouping errors -
✅ Candidate name extraction filtering - ✅ Cache clearing automation -
✅ Project header detection refinement

\### Demo Clip (Optional) - \[Optional: 1--2 minute demo showing resume
parsing workflow with corrected output\]

\-\--

\*\*Next Review Meeting:\*\* \[DATE TO BE SCHEDULED\]
