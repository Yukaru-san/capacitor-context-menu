# capacitor-context-menu

Allows catching context-menu events (PROCESS_TEXT) from android intentions

## Install

```bash
npm install capacitor-context-menu
npx cap sync
```

## API

<docgen-index>

* [`checkProcessTextIntentReceived()`](#checkprocesstextintentreceived)
* [`addListener('processTextReceived', ...)`](#addlistenerprocesstextreceived)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### checkProcessTextIntentReceived()

```typescript
checkProcessTextIntentReceived() => Promise<{ text: string; }>
```

**Returns:** <code>Promise&lt;{ text: string; }&gt;</code>

--------------------


### addListener('processTextReceived', ...)

```typescript
addListener(eventName: 'processTextReceived', listenerFunc: (text: string) => void) => void
```

| Param              | Type                                   |
| ------------------ | -------------------------------------- |
| **`eventName`**    | <code>'processTextReceived'</code>     |
| **`listenerFunc`** | <code>(text: string) =&gt; void</code> |

--------------------

</docgen-api>
